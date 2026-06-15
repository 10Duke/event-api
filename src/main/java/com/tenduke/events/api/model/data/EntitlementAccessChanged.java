package com.tenduke.events.api.model.data;

/**
 * Fired when access to an Entitlement has been either granted or revoked.
 *
 */
public interface EntitlementAccessChanged extends TimeFields, RequestFields {

    /**
     * Id of the Entitlement.
     *
     * @return id of the entitlement
     */
    String getEntitlementId();

    /**
     * Id of the subject (grantee or revokee).
     *
     * @return id of the subject
     */
    String getSubjectId();

    /**
     * Id of organization owning the entitlement.
     * Entitlement owner organization and entitlement owner user are mutually exclusive, only one of them is set.
     *
     * @return the organization id, {@code null} if the entitlement is not owned by an organization
     */
    String getEntitlementOwnerOrganizationId();

    /**
     * Id of user owning the entitlement.
     * Entitlement owner organization and entitlement owner user are mutually exclusive, only one of them is set.
     *
     * @return the user id, {@code null} if the entitlement is not owned by an user
     */
    String getEntitlementOwnerUserId();

}
