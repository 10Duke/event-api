package com.tenduke.events.api.model.object;

import com.tenduke.events.api.model.object.audit.Created;
import com.tenduke.events.api.model.object.audit.Deleted;
import com.tenduke.events.api.model.object.audit.Read;
import com.tenduke.events.api.model.object.audit.Updated;
import io.github.classgraph.ClassGraph;
import io.github.classgraph.ScanResult;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit test for printing fields of each event object interface in the
 * {@code com.tenduke.events.api.model.object} package.
 * @author jarkko
 */
public class PrintEventObjectFieldsTest {

    /**
     * Event data objects related to user management.
     */
    private static final List<Class<?>> USER_MANAGEMENT_OBJS = Arrays.asList(
            OrganizationInvitationRevoked.class,
            OrganizationInvitationSent.class,
            OrganizationInvitationTokenGenerated.class,
            UserCreated.class,
            UserDeleted.class,
            UserInvitationRevoked.class,
            UserInvitationSent.class,
            UserInvitationTokenGenerated.class,
            UserInvitedAndPreRegistered.class,
            UserPasswordCreated.class,
            UserUpdated.class,
            UserValidationEmailSent.class);

    /**
     * Event data objects related to user actions.
     */
    private static final List<Class<?>> USER_ACTION_OBJS = Arrays.asList(
            CredentialActivated.class,
            CredentialActivationStarted.class,
            ForgotPasswordEmailSent.class,
            ForgotPasswordReset.class,
            OrganizationInvitationAccepted.class,
            OrganizationInvitationDeclined.class,
            TokenIssued.class,
            UserAuthenticated.class,
            UserEmailChanged.class,
            UserInvitationAccepted.class,
            UserInvitationDeclined.class,
            UserLoggedOut.class,
            UserMfaActivated.class,
            UserMfaDeactivated.class,
            UserPasswordChanged.class,
            UserRecoveryEmailAdded.class,
            UserRegistered.class);

    /**
     * Event data objects related to license provisioning.
     */
    private static final List<Class<?>> LICENSE_PROVISIONING_OBJS = Arrays.asList(
            LicenseProvisioned.class,
            LicenseRevoked.class);

    /**
     * Event data objects related to license management.
     */
    private static final List<Class<?>> LICENSE_MANAGEMENT_OBJS = Arrays.asList(
            LicenseConsumeAllowed.class,
            LicenseConsumeDenied.class,
            LicenseReserved.class,
            LicenseReservationReleased.class);

    /**
     * Event data objects related to license consumption.
     */
    private static final List<Class<?>> LICENSE_CONSUMPTION_OBJS = Arrays.asList(
            LicenseChecked.class,
            LicenseConsumed.class,
            LicenseReleased.class);

    /**
     * Event data objects for technical data.
     */
    private static final List<Class<?>> TECHNICAL_OBJS = Arrays.asList(
            RequestProcessed.class);

    /**
     * Event data objects for audit events.
     */
    private static final List<Class<?>> AUDIT_OBJS = Arrays.asList(
            Created.class,
            Deleted.class,
            Read.class,
            Updated.class);

    /**
     * Prints event object fields.
     */
    @Test
    public void printEventObjectFields() {
        final Set<Class<?>> eventObjInterfaces = findEventObjectInterfaces();

        printEventObjectFields(USER_MANAGEMENT_OBJS, "User management", eventObjInterfaces);
        printEventObjectFields(USER_ACTION_OBJS, "User actions", eventObjInterfaces);
        printEventObjectFields(LICENSE_PROVISIONING_OBJS, "License provisioning", eventObjInterfaces);
        printEventObjectFields(LICENSE_MANAGEMENT_OBJS, "License management", eventObjInterfaces);
        printEventObjectFields(LICENSE_CONSUMPTION_OBJS, "License consumption", eventObjInterfaces);
        printEventObjectFields(TECHNICAL_OBJS, "Technical", eventObjInterfaces);
        printEventObjectFields(AUDIT_OBJS, "Audit", eventObjInterfaces);

        assertEquals(
                0,
                eventObjInterfaces.size(),
                "Some event objects were not printed: "
                + eventObjInterfaces.stream().map(Class::getName).collect(Collectors.joining(","))
                + ". Please add these to the printout and documentation.");
    }

    /**
     * Prints event object fields for event objects of a category.
     * @param eventObjsOfCategory The event object interfaces.
     * @param category The event object category.
     * @param allEventObjs Event objects found by scanning and not yet printed.
     */
    private void printEventObjectFields(
            List<Class<?>> eventObjsOfCategory,
            String category,
            Set<Class<?>> allEventObjs) {
        System.out.println(category);
        System.out.println();

        for (Class<?> eventObj : eventObjsOfCategory) {
            if (!allEventObjs.remove(eventObj)) {
                throw new IllegalStateException(
                        eventObj.getName()
                        + " not found in event objects. Has it been printed already?");
            }

            printEventObjectFields(eventObj);
            System.out.println();
        }
    }

    /**
     * Prints event object fields of a single event object type.
     * @param eventObj The event object interface.
     */
    private void printEventObjectFields(Class<?> eventObj) {
        System.out.println(eventObj.getSimpleName());
        List<Method> fieldGetters = getEventObjectFields(eventObj);
        for (Method fieldGetter : fieldGetters) {
            printEventObjectField(fieldGetter);
        }
    }

    /**
     * Prints a single event object field.
     * @param fieldGetter The field getter method.
     */
    private void printEventObjectField(Method fieldGetter) {
        String getterName = fieldGetter.getName();
        int getterPrefixLength;
        if (getterName.startsWith("get")) {
            getterPrefixLength = 3;
        } else if (getterName.startsWith("is")) {
            getterPrefixLength = 2;
        } else {
            getterPrefixLength = 0;
        }

        String fieldName = new StringBuilder(getterName.length())
                .append(getterName.substring(getterPrefixLength, getterPrefixLength + 1).toLowerCase(Locale.ROOT))
                .append(getterName.substring(getterPrefixLength + 1))
                .toString();
        String fieldType = fieldGetter.getReturnType().getSimpleName();

        System.out.println(" - " + fieldName + ": " + fieldType);
    }

    /**
     * Gets event object field getters of the given event object interface type,
     * including fields of implemented interfaces.
     * @param eventObjectInterfaceType The event object interface type.
     * @return List of event object field getter methods.
     */
    private List<Method> getEventObjectFields(Class<?> eventObjectInterfaceType) {
        final List<Method> retValue = new ArrayList<>();
        getEventObjectFields(retValue, eventObjectInterfaceType);
        return retValue;
    }

    /**
     * Recursively gets event object field getter methods of the given event object interface type
     * and interfaces implemented by it.
     * @param eventObjectInterfaceType The event object interface type.
     * @return List of event object field getter methods.
     */
    private void getEventObjectFields(List<Method> fieldGetters, Class<?> eventObjectInterfaceType) {
        if (!eventObjectInterfaceType.getName().startsWith("com.tenduke")) {
            return;
        }

        for (Class<?> implementedInterface : eventObjectInterfaceType.getInterfaces()) {
            getEventObjectFields(fieldGetters, implementedInterface);
        }

        fieldGetters.addAll(Arrays.asList(eventObjectInterfaceType.getDeclaredMethods()));
    }

    /**
     * Scans the {@code com.tenduke.events.api.model.object} package for finding
     * all event object interfaces.
     * @return Set of {@link Class} objects for the event object interfaces.
     */
    private Set<Class<?>> findEventObjectInterfaces() {
        ClassGraph classGraph = new ClassGraph()
                .enableAllInfo()
                .acceptPackages("com.tenduke.events.api.model.object")
                .rejectClasses(PrintEventObjectFieldsTest.class.getName());
        try (ScanResult scanResult = classGraph.scan()) {
            return scanResult.getAllInterfaces().stream()
                    .map(classInfo -> classInfo.loadClass())
                    .collect(Collectors.toSet());
        }
    }
}
