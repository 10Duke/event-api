# EventApi

Common API for using the Event Data service.

## Events, version 1.13.2

Events described by this schema are listed below by category. Please notice that some events could belong to multiple categories, but here each event is listed in just one category according to the most common use case.

> :warning: **Events may contain additional fields and some fields may not be populated in all cases**
>
> Clients reading and handling these events must allow fields that are not included in this documentation. 10Duke applications may add new fields, for example by customer specific extensions.
>
> For some rare cases it is also possible that some of the described fields are not populated, for example fields may be filtered out for privacy reasons.

### Envelope

All events consist of an *envelope* and the *event data*. The envelope means a set of standard root level event fields. One of these fields is *data* for the different event data objects.

This chapter describes the envelope fields. Rest of the chapters below describe the event data objects, i.e. objects that can be set as value of the *data* envelope field.

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventType | String | Event type |
| eventId | String | Event id |
| eventObjectId | String | Id of object that the event primarily relates to. Events sent by 10Duke Identity-based Entitlement set this to id of the actor whose action triggered the event, if an authenticated actor exists. |
| eventObjectType | String | Type of object that the event primarily relates to. Events sent by 10Duke Identity-based Entitlement set this to "user", if an authenticated actor exists. |
| eventSourceId | String | Identifier or name of the system that sent the event |
| eventReceived | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| eventKeyId | String | Id of encryption key, used if encrypting the event data |
| version | String | Version of the event data schema that the event conforms to. |
| data | Object | The event data object. Common event data object types are described in the chapters below. |

### User management

Events related to user management.

#### OrganizationInvitationRevoked

*An earlier created organization invitation has been revoked.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| organizationId | String | Organization id |
| invitationId | String | Invitation id |
| technicalUser | Boolean | DEPRECATED and will be replaced by userType. True if userId represents a technical user, false or not specified otherwise. |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| requestId | String | Request id |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |

#### OrganizationInvitationSent

*Organization invitation has been sent to an invitee.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| organizationId | String | Organization id |
| invitationId | String | Invitation id |
| technicalUser | Boolean | DEPRECATED and will be replaced by userType. True if userId represents a technical user, false or not specified otherwise. |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| requestId | String | Request id |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |

#### OrganizationInvitationTokenGenerated

*A new organization invitation token has been generated. Typically this token has been delivered to an invitee by some means.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| organizationId | String | Organization id |
| invitationId | String | Invitation id |
| technicalUser | Boolean | DEPRECATED and will be replaced by userType. True if userId represents a technical user, false or not specified otherwise. |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| requestId | String | Request id |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |

#### UserAddedToOrganizationGroup

*User has been added to an organization group.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| organizationId | String | Organization id |
| organizationGroupId | String | Organization group id |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| userId | String | User id of the user added to organization group |
| userType | String | User type |

#### UserAddedToOrganizationRole

*User has been added to an organization role.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| organizationId | String | Organization id |
| organizationRoleId | String | Organization role id |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| userId | String | User id of the user added to organization role |
| userType | String | User type |

#### UserCreated

*User data has been created in the system.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| technicalUser | Boolean | DEPRECATED and will be replaced by userType. True if userId represents a technical user, false or not specified otherwise. |
| userId | String | User id |
| userType | String | User type |

#### UserDeleted

*User data has been deleted from the system.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| technicalUser | Boolean | DEPRECATED and will be replaced by userType. True if userId represents a technical user, false or not specified otherwise. |
| userId | String | User id |
| userType | String | User type |

#### UserInvitationRevoked

*An earlier created user invitation has been revoked.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| invitationId | String | Invitation id |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| requestId | String | Request id |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |

#### UserInvitationSent

*User invitation has been sent to an invitee.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| invitationId | String | Invitation id |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| requestId | String | Request id |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |

#### UserInvitationTokenGenerated

*A new user invitation token has been generated. Typically this token has been delivered to an invitee by some means.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| invitationId | String | Invitation id |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| requestId | String | Request id |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |

#### UserInvitedAndPreRegistered

*__DEPRECATED:__ User has been invited to use the system, user data has been prepopulated in the system.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| organizationId | String | Organization id |
| invitationId | String | Invitation id |
| technicalUser | Boolean | DEPRECATED and will be replaced by userType. True if userId represents a technical user, false or not specified otherwise. |
| userId | String | User id |
| userType | String | User type |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| requestId | String | Request id |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |

#### UserPasswordCreated

*DEPRECATED, `CredentialActivated` used since 10Duke Enterprise 6.0.0 instead. Password has been created for a user.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| technicalUser | Boolean | DEPRECATED and will be replaced by userType. True if userId represents a technical user, false or not specified otherwise. |
| userId | String | User id |
| userType | String | User type |

#### UserRemovedFromOrganizationGroup

*User has been removed from an organization group.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| organizationId | String | Organization id |
| organizationGroupId | String | Organization group id |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| userId | String | User id of the user removed from organization group |
| userType | String | User type |

#### UserRemovedFromOrganizationRole

*User has been removed from an organization role.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| organizationId | String | Organization id |
| organizationRoleId | String | Organization role id |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| userId | String | User id of the user removed from organization role |
| userType | String | User type |

#### UserUpdated

*User data has been updated.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| technicalUser | Boolean | DEPRECATED and will be replaced by userType. True if userId represents a technical user, false or not specified otherwise. |
| userId | String | User id |
| userType | String | User type |
| oldUserName | String | Previous user name |

### User actions

Events for actions that user has done in the system.

#### CredentialActivated

*New authentication credential has been activated for user. For example, user has added a passkey, or received email sent for resetting password and completed the password reset.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| technicalUser | Boolean | DEPRECATED and will be replaced by userType. True if userId represents a technical user, false or not specified otherwise. |
| userId | String | User id |
| userType | String | User type |
| activationProcess | String | `ResetCredential` for the "forgot password" process, or `ActivateUser` for user account activation process, or name of a credential setting operation |
| credentialType | String | Type of the activated credential, one of the following (or a custom value): `EmailAndPassword`, `WebAuthnCredential` or `TimeBasedOTPCredential` |

#### CredentialActivationStarted

*Activating a new authentication credential for user has been started. For example, user has invoked "forgot password" and email for resetting password has been sent to the user.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| technicalUser | Boolean | DEPRECATED and will be replaced by userType. True if userId represents a technical user, false or not specified otherwise. |
| userId | String | User id |
| userType | String | User type |
| validUntil | Long | Validity end time as milliseconds since 1970-01-01T00:00:00Z (UTC), or unspecified for indefinite validity |
| validFrom | Long | Validity start time as milliseconds since 1970-01-01T00:00:00Z (UTC), or unspecified invalid / validity not started |
| activationProcess | String | `ResetCredential` for the "forgot password" process, or `ActivateUser` for user account activation process |
| credentialType | String | Type of the credential to activate, if already known when starting the activation process. Value is one of the following (or a custom value): `EmailAndPassword`, `WebAuthnCredential` or `TimeBasedOTPCredential` |

#### CredentialDeactivated

*User's authentication credential has been deactivated.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| technicalUser | Boolean | DEPRECATED and will be replaced by userType. True if userId represents a technical user, false or not specified otherwise. |
| userId | String | User id |
| userType | String | User type |
| credentialType | String | Type of the activated credential, one of the following (or a custom value): `EmailAndPassword`, `WebAuthnCredential` or `TimeBasedOTPCredential` |

#### ForgotPasswordEmailSent

*DEPRECATED, `CredentialActivationStarted` used since 10Duke Enterprise 6.0.0 instead. User has invoked "forgot password" and email for resetting password has been sent to the user.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| technicalUser | Boolean | DEPRECATED and will be replaced by userType. True if userId represents a technical user, false or not specified otherwise. |
| userId | String | User id |
| userType | String | User type |
| validUntil | Long | Validity end time as milliseconds since 1970-01-01T00:00:00Z (UTC), or unspecified for indefinite validity |
| validFrom | Long | Validity start time as milliseconds since 1970-01-01T00:00:00Z (UTC), or unspecified invalid / validity not started |

#### ForgotPasswordReset

*DEPRECATED, `CredentialActivated` used since 10Duke Enterprise 6.0.0 instead. User has received email sent for resetting password and completed the password reset.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| technicalUser | Boolean | DEPRECATED and will be replaced by userType. True if userId represents a technical user, false or not specified otherwise. |
| userId | String | User id |
| userType | String | User type |

#### OrganizationInvitationAccepted

*User has accepted organization invitation.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| organizationId | String | Organization id |
| invitationId | String | Invitation id |
| technicalUser | Boolean | DEPRECATED and will be replaced by userType. True if userId represents a technical user, false or not specified otherwise. |
| userId | String | User id |
| userType | String | User type |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| requestId | String | Request id |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |

#### TokenIssued

*OAuth 2.0 token has been issued*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Token issued time, milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| technicalUser | Boolean | DEPRECATED and will be replaced by userType. True if userId represents a technical user, false or not specified otherwise. |
| userId | String | User id |
| userType | String | User type |
| expiresIn | Long | Token lifetime, in seconds since `eventTime` |
| refreshTokenIssued | Boolean | True if a refresh token was issued, false otherwise |
| refreshTokenExpiresIn | Long | Refresh tokenlifetime, in seconds since `eventTime` |
| grantType | String | The OAuth 2.0 grant type |
| scope | String | The granted OAuth 2.0 scope as a space-delimited string |

#### OrganizationInvitationDeclined

*User has declined organization invitation.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| organizationId | String | Organization id |
| invitationId | String | Invitation id |
| technicalUser | Boolean | DEPRECATED and will be replaced by userType. True if userId represents a technical user, false or not specified otherwise. |
| userId | String | User id |
| userType | String | User type |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| requestId | String | Request id |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |

#### UserAuthenticated

*User has been authenticated / logged in.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| technicalUser | Boolean | DEPRECATED and will be replaced by userType. True if userId represents a technical user, false or not specified otherwise. |
| userId | String | User id |
| userType | String | User type |
| remember | Boolean | true if user specified preference for remembering the authentication, false or unspecified otherwise |

#### UserEmailChanged

*User has changed email address.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| technicalUser | Boolean | DEPRECATED and will be replaced by userType. True if userId represents a technical user, false or not specified otherwise. |
| userId | String | User id |
| userType | String | User type |
| oldUserName | String | Previous username |

#### UserInvitationAccepted

*User has accepted a user invitation.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| invitationId | String | Invitation id |
| userId | String | User id |
| userType | String | User type |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| requestId | String | Request id |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |

#### UserInvitationDeclined

*User has declined a user invitation.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| invitationId | String | Invitation id |
| userId | String | User id |
| userType | String | User type |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| requestId | String | Request id |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |

#### UserLoggedOut

*User has logged out.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| technicalUser | Boolean | DEPRECATED and will be replaced by userType. True if userId represents a technical user, false or not specified otherwise. |
| userId | String | User id |
| userType | String | User type |

#### UserMfaActivated

*DEPRECATED, `CredentialActivated` used since 10Duke Enterprise 6.0.0 instead. User has activated MFA device for 2nd factor authentication.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| technicalUser | Boolean | DEPRECATED and will be replaced by userType. True if userId represents a technical user, false or not specified otherwise. |
| userId | String | User id |
| userType | String | User type |

#### UserMfaDeactivated

*DEPRECATED, `CredentialDectivated` used since 10Duke Enterprise 6.0.0 instead. User has deactivated MFA device used for 2nd factor authentication.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| technicalUser | Boolean | DEPRECATED and will be replaced by userType. True if userId represents a technical user, false or not specified otherwise. |
| userId | String | User id |
| userType | String | User type |

#### UserPasswordChanged

*User has changed password.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| technicalUser | Boolean | DEPRECATED and will be replaced by userType. True if userId represents a technical user, false or not specified otherwise. |
| userId | String | User id |
| userType | String | User type |

#### UserRecoveryEmailAdded

*User has added a user account recovery email.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| technicalUser | Boolean | DEPRECATED and will be replaced by userType. True if userId represents a technical user, false or not specified otherwise. |
| userId | String | User id |
| userType | String | User type |

#### UserRegistered

*A new user account has been registered in the system.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| technicalUser | Boolean | DEPRECATED and will be replaced by userType. True if userId represents a technical user, false or not specified otherwise. |
| userId | String | User id |
| userType | String | User type |

### License provisioning

Events related to license provisioning.

#### ActivationCodeBlocked

*Activation code has been blocked and can not be used for license provisioning.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| code | String | Blocked activation code |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |

#### ActivationCodeUnblocked

*Activation code has been unblocked and can be used again for license provisioning.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| code | String | Unblocked activation code |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |

#### LicenseProvisioned

*License (license credits) has been granted.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| licenseOwnerUserId | String | Id of licensee if licensee is a user |
| licenseOwnerOrganizationId | String | Id of licensee if licensee is an organization |
| licensedItemId | String | Licensed item id |
| licenseId | String | License id |
| entitlementId | String | Entitlement id |
| useTime | Long | Granted use time |
| useCount | Long | Granted use count |
| seatCount | Integer | Granted seat count |
| seatReservations | Long | Granted seat reservations |
| validFrom | Long | Validity start time as milliseconds since 1970-01-01T00:00:00Z (UTC), or unspecified invalid / validity not started |
| validUntil | Long | Validity end time as milliseconds since 1970-01-01T00:00:00Z (UTC), or unspecified for indefinite validity |
| technicalUser | Boolean | DEPRECATED and will be replaced by userType. True if userId represents a technical user, false or not specified otherwise. |
| userId | String | Id of licensee if licensee is a user |
| userType | String | Type of licensee if licensee is a user |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |

#### LicenseRevoked

*__DEPRECATED:__ License (license credits) has been revoked.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| licenseOwnerUserId | String | Id of licensee if licensee is a user |
| licenseOwnerOrganizationId | String | Id of licensee if licensee is an organization |
| licensedItemId | String | Licensed item id |
| licenseId | String | License id |
| entitlementId | String | Entitlement id |
| useTime | Long | Revoked use time |
| useCount | Long | Revoked use count |
| seatCount | Integer | Revoked seat count |
| technicalUser | Boolean | DEPRECATED and will be replaced by userType. True if userId represents a technical user, false or not specified otherwise. |
| userId | String | User id |
| userType | String | User type |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |

### License management

Events related to license management.

#### LicenseConsumptionAllowed

*License consumption has been allowed for a user.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| licenseOwnerUserId | String | Id of licensee if licensee is a user |
| licenseOwnerOrganizationId | String | Id of licensee if licensee is an organization |
| licensedItemId | String | Licensed item id |
| licenseId | String | License id |
| entitlementId | String | Entitlement id |
| reservationType | String | Reservation type: "reserved", "denied" or unspecified for floating |
| assignmentId | String | Assignment id |
| technicalUser | Boolean | DEPRECATED and will be replaced by userType. True if userId represents a technical user, false or not specified otherwise. |
| userId | String | User id |
| userType | String | User type |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |

#### LicenseConsumeDenied

*License consumption has been denied from a user.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| licenseOwnerUserId | String | Id of licensee if licensee is a user |
| licenseOwnerOrganizationId | String | Id of licensee if licensee is an organization |
| licensedItemId | String | Licensed item id |
| licenseId | String | License id |
| entitlementId | String | Entitlement id |
| reservationType | String | Reservation type: "reserved", "denied" or unspecified for floating |
| assignmentId | String | Assignment id |
| technicalUser | Boolean | DEPRECATED and will be replaced by userType. True if userId represents a technical user, false or not specified otherwise. |
| userId | String | User id |
| userType | String | User type |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |

#### LicenseReserved

*License has been reserved for a user.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| licenseOwnerUserId | String | Id of licensee if licensee is a user |
| licenseOwnerOrganizationId | String | Id of licensee if licensee is an organization |
| licensedItemId | String | Licensed item id |
| licenseId | String | License id |
| entitlementId | String | Entitlement id |
| reservationType | String | Reservation type: "reserved", "denied" or unspecified for floating |
| assignmentId | String | Assignment id |
| technicalUser | Boolean | DEPRECATED and will be replaced by userType. True if userId represents a technical user, false or not specified otherwise. |
| userId | String | User id |
| userType | String | User type |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |

#### LicenseReservationReleased

*License reservation has been removed from a user.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| licenseOwnerUserId | String | Id of licensee if licensee is a user |
| licenseOwnerOrganizationId | String | Id of licensee if licensee is an organization |
| licensedItemId | String | Licensed item id |
| licenseId | String | License id |
| entitlementId | String | Entitlement id |
| reservationType | String | Reservation type: "reserved" |
| assignmentId | String | Assignment id |
| technicalUser | Boolean | DEPRECATED and will be replaced by userType. True if userId represents a technical user, false or not specified otherwise. |
| userId | String | Id of the user the reservation was removed from |
| userType | String | Type of the user the reservation was removed from |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |

### License consumption

Events related to end users and client applications consuming licenses.

#### LicenseChecked

*License availability has been checked, but license has not been consumed.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| licenseOwnerUserId | String | Id of licensee if licensee is a user |
| licenseOwnerOrganizationId | String | Id of licensee if licensee is an organization |
| entitlementId | String | Entitlement id |
| licensedItemId | String | Licensed item id |
| licenseId | String | License id |
| reservationType | String | Assignment reservation type "reserved" or unspecified for floating |
| assignmentId | String | Assignment id |
| licenseAnchors | List | List of [LicenseAnchorIdFields](#licenseanchoridfields) objects |
| leaseId | String | Lease id |
| consumptionMode | String | Consumption mode: "cache" for online use or "checkout" for offline use |
| consumedVersion | String | Consumed version |
| grantedUntil | Long | Latest time that consumption is allowed by the granted lease, milliseconds since 1970-01-01T00:00:00Z (UTC) |
| licensedItemName | String | Licensed item name |
| consumptionId | String | Consumption id |
| technicalUser | Boolean | DEPRECATED and will be replaced by userType. True if userId represents a technical user, false or not specified otherwise. |
| userId | String | User id |
| userType | String | User type |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |

#### LicenseConsumed

*License has been consumed.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| licenseOwnerUserId | String | Id of licensee if licensee is a user |
| licenseOwnerOrganizationId | String | Id of licensee if licensee is an organization |
| entitlementId | String | Entitlement id |
| licensedItemId | String | Licensed item id |
| licenseId | String | License id |
| reservationType | String | Assignment reservation type "reserved" or unspecified for floating |
| assignmentId | String | Assignment id |
| licenseAnchors | List | List of [LicenseAnchorIdFields](#licenseanchoridfields) objects |
| leaseId | String | Lease id |
| consumptionMode | String | Consumption mode: "cache" for online use or "checkout" for offline use |
| consumedVersion | String | Consumed version |
| grantedUntil | Long | Latest time that consumption is allowed by the granted lease, milliseconds since 1970-01-01T00:00:00Z (UTC) |
| licensedItemName | String | Licensed item name |
| consumptionId | String | Consumption id |
| technicalUser | Boolean | DEPRECATED and will be replaced by userType. True if userId represents a technical user, false or not specified otherwise. |
| userId | String | User id |
| userType | String | User type |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| consumedUseCount | Long | Use count consumed |
| consumedUseTime | Long | Use time consumed |

#### LicenseReleased

*License consumption has been released.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| licenseOwnerUserId | String | Id of licensee if licensee is a user |
| licenseOwnerOrganizationId | String | Id of licensee if licensee is an organization |
| licensedItemId | String | Licensed item id |
| licenseId | String | License id |
| entitlementId | String | Entitlement id |
| licenseAnchors | List | List of [LicenseAnchorIdFields](#licenseanchoridfields) objects |
| leaseId | String | Lease id |
| technicalUser | Boolean | DEPRECATED and will be replaced by userType. True if userId represents a technical user, false or not specified otherwise. |
| userId | String | User id |
| userType | String | User type |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |

### Technical

Technical events.

#### RequestProcessed

*Request has been processed.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| requestId | String | Request id |
| method | String | HTTP method |
| status | Integer | Response status |
| clientIpAddress | String | Client IP address |
| userAgentSessionId | String | User agent session id |
| origin | String | Request origin |
| referer | String | HTTP referer |
| userAgent | String | User agent |
| url | String | Request URL |
| technicalUser | Boolean | DEPRECATED and will be replaced by userType. True if userId represents a technical user, false or not specified otherwise. |
| userId | String | User id |
| userType | String | User type |
| authenticatedSessionId | String | Authenticated session id |
| clientApplicationType | String | Client application type, or unspecified if not a client application request |
| clientApplicationId | String | Client application id, or unspecified if not a client application request |
| providerId | String | Provider id, or unspecified if not a provider request  |
| providerType | String | Provider type, or unspecified if not a provider request |
| duration | Long | Request duration |
| tenantId | String | Tenant id |
| errorInfo | ErrorInfo | [ErrorInfo](#errorinfo) object describing error if an error occurred |

### Audit

Audit trail events.

#### Created

*An entity has been created in the system.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| technicalUser | Boolean | DEPRECATED and will be replaced by userType. True if userId represents a technical user, false or not specified otherwise. |
| userId | String | User id |
| userType | String | User type |
| objectName | String | Object type name |
| objectId | String | Object id |
| modifiedFields | Object | Map with modified object fields |

#### Deleted

*An entity has been deleted from the system.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| technicalUser | Boolean | DEPRECATED and will be replaced by userType. True if userId represents a technical user, false or not specified otherwise. |
| userId | String | User id |
| userType | String | User type |
| objectName | String | Object type name |
| objectId | String | Object id |
| oldFields | Object | All fields of the deleted object at the moment of deletion |

#### Updated

*An entity has been updated.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| technicalUser | Boolean | DEPRECATED and will be replaced by userType. True if userId represents a technical user, false or not specified otherwise. |
| userId | String | User id |
| userType | String | User type |
| objectName | String | Object type name |
| objectId | String | Object id |
| modifiedFields | Object | Map with modified object fields |

### Field types

Event object field value types.

#### ErrorInfo

*Describes an error.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| error | String | Error code |
| errorDescription | String | Textual error description |
| errorUri | String | URI for additional information |

#### LicenseAnchorIdFields

*Describes a license anchor*

| Field name | Type | Description |
| ---        | ---  | ---         |
| licenseAnchorType | String | Type name of the license anchor object |
| licenseAnchorId | String | Id of the license anchor object |
