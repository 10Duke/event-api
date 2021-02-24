# EventApi

Common API for using the Event Data service.

## Events

Events described by this schema are listed below by category. Please notice that some events could belong to multiple categories, but here each event is listed in just one category according to the most common use case.

### User management

Events related to user management.

#### OrganizationInvitationRevoked

*An earlier created organization invitation has been revoked.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| organizationId | String | Organization id |
| invitationId | String | Invitation id |
| technicalUser | Boolean | true if userId represents a technical user, false or not specified otherwise |
| userId | String | User id |
| errorInfo | ErrorInfo | ErrorInfo object describing error if an error occurred |
| requestId | String | Request id |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |

#### OrganizationInvitationSent

*Organization invitation has been sent to an invitee.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| organizationId | String | Organization id |
| invitationId | String | Invitation id |
| technicalUser | Boolean | true if userId represents a technical user, false or not specified otherwise |
| userId | String | User id |
| errorInfo | ErrorInfo | ErrorInfo object describing error if an error occurred |
| requestId | String | Request id |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |

#### OrganizationInvitationTokenGenerated

*A new invitation token has been generated. Typically this token has been delivered to an invitee by some means.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| organizationId | String | Organization id |
| invitationId | String | Invitation id |
| technicalUser | Boolean | true if userId represents a technical user, false or not specified otherwise |
| userId | String | User id |
| errorInfo | ErrorInfo | ErrorInfo object describing error if an error occurred |
| requestId | String | Request id |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |

#### UserCreated

*User data has been created in the system.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| errorInfo | ErrorInfo | ErrorInfo object describing error if an error occurred |
| technicalUser | Boolean | true if userId represents a technical user, false or not specified otherwise |
| userId | String | User id |

#### UserDeleted

*User data has been deleted from the system.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| errorInfo | ErrorInfo | ErrorInfo object describing error if an error occurred |
| technicalUser | Boolean | true if userId represents a technical user, false or not specified otherwise |
| userId | String | User id |

#### UserInvitedAndPreRegistered

*User has been invited to use the system, user data has been prepopulated in the system.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| organizationId | String | Organization id |
| invitationId | String | Invitation id |
| technicalUser | Boolean | true if userId represents a technical user, false or not specified otherwise |
| userId | String | User id |
| errorInfo | ErrorInfo | ErrorInfo object describing error if an error occurred |
| requestId | String | Request id |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |

#### UserPasswordCreated

*Password has been created for a user.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| errorInfo | ErrorInfo | ErrorInfo object describing error if an error occurred |
| technicalUser | Boolean | true if userId represents a technical user, false or not specified otherwise |
| userId | String | User id |

#### UserUpdated

*User data has been updated.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| errorInfo | ErrorInfo | ErrorInfo object describing error if an error occurred |
| technicalUser | Boolean | true if userId represents a technical user, false or not specified otherwise |
| userId | String | User id |
| oldUserName | String | Previous user name |

#### UserValidationEmailSent

*Email has been sent to user for validation the email address.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| errorInfo | ErrorInfo | ErrorInfo object describing error if an error occurred |
| technicalUser | Boolean | true if userId represents a technical user, false or not specified otherwise |
| userId | String | User id |

### User actions

Events for actions that user has done in the system.

#### ForgotPasswordEmailSent

*User has invoked "forgot password" and email for resetting password has been sent to the user.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| errorInfo | ErrorInfo | ErrorInfo object describing error if an error occurred |
| technicalUser | Boolean | true if userId represents a technical user, false or not specified otherwise |
| userId | String | User id |
| validUntil | Long | Validity end time as milliseconds since 1970-01-01T00:00:00Z (UTC), or unspecified for indefinite validity |
| validFrom | Long | Validity start time as milliseconds since 1970-01-01T00:00:00Z (UTC), or unspecified invalid / validity not started |

#### ForgotPasswordReset

*User has received email sent for resetting password and completed the password reset.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| errorInfo | ErrorInfo | ErrorInfo object describing error if an error occurred |
| technicalUser | Boolean | true if userId represents a technical user, false or not specified otherwise |
| userId | String | User id |

#### OrganizationInvitationAccepted

*User has accepted organization invitation.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| organizationId | String | Organization id |
| invitationId | String | Invitation id |
| technicalUser | Boolean | true if userId represents a technical user, false or not specified otherwise |
| userId | String | User id |
| errorInfo | ErrorInfo | ErrorInfo object describing error if an error occurred |
| requestId | String | Request id |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |

#### OrganizationInvitationDeclined

*User has declined organization invitation.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| organizationId | String | Organization id |
| invitationId | String | Invitation id |
| technicalUser | Boolean | true if userId represents a technical user, false or not specified otherwise |
| userId | String | User id |
| errorInfo | ErrorInfo | ErrorInfo object describing error if an error occurred |
| requestId | String | Request id |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |

#### UserAuthenticated

*User has been authenticated / logged in.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| errorInfo | ErrorInfo | ErrorInfo object describing error if an error occurred |
| technicalUser | Boolean | true if userId represents a technical user, false or not specified otherwise |
| userId | String | User id |
| remember | Boolean | true if user specified preference for remembering the authentication, false or unspecified otherwise |

#### UserEmailChanged

*User has changed email address.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| errorInfo | ErrorInfo | ErrorInfo object describing error if an error occurred |
| technicalUser | Boolean | true if userId represents a technical user, false or not specified otherwise |
| userId | String | User id |
| oldUserName | String | Previous username |

#### UserLoggedOut

*User has logged out.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| errorInfo | ErrorInfo | ErrorInfo object describing error if an error occurred |
| technicalUser | Boolean | true if userId represents a technical user, false or not specified otherwise |
| userId | String | User id |

#### UserMfaActivated

*User has activated MFA device for 2nd factor authentication.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| errorInfo | ErrorInfo | ErrorInfo object describing error if an error occurred |
| technicalUser | Boolean | true if userId represents a technical user, false or not specified otherwise |
| userId | String | User id |

#### UserMfaDeactivated

*User has deactivated MFA device used for 2nd factor authentication.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| errorInfo | ErrorInfo | ErrorInfo object describing error if an error occurred |
| technicalUser | Boolean | true if userId represents a technical user, false or not specified otherwise |
| userId | String | User id |

#### UserPasswordChanged

*User has changed password.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| errorInfo | ErrorInfo | ErrorInfo object describing error if an error occurred |
| technicalUser | Boolean | true if userId represents a technical user, false or not specified otherwise |
| userId | String | User id |

#### UserRecoveryEmailAdded

*User has added a user account recovery email.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| errorInfo | ErrorInfo | ErrorInfo object describing error if an error occurred |
| technicalUser | Boolean | true if userId represents a technical user, false or not specified otherwise |
| userId | String | User id |

#### UserRegistered

*A new user account has been registered in the system.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| errorInfo | ErrorInfo | ErrorInfo object describing error if an error occurred |
| technicalUser | Boolean | true if userId represents a technical user, false or not specified otherwise |
| userId | String | User id |

### License provisioning

Events related to license provisioning.

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
| technicalUser | Boolean | true if userId represents a technical user, false or not specified otherwise |
| userId | String | User id |
| errorInfo | ErrorInfo | ErrorInfo object describing error if an error occurred |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |

#### LicenseRevoked

*License (license credits) has been revoked.*

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
| technicalUser | Boolean | true if userId represents a technical user, false or not specified otherwise |
| userId | String | User id |
| errorInfo | ErrorInfo | ErrorInfo object describing error if an error occurred |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |

### License management

Events related to license management.

#### LicenseConsumeAllowed

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
| technicalUser | Boolean | true if userId represents a technical user, false or not specified otherwise |
| userId | String | User id |
| errorInfo | ErrorInfo | ErrorInfo object describing error if an error occurred |
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
| technicalUser | Boolean | true if userId represents a technical user, false or not specified otherwise |
| userId | String | User id |
| errorInfo | ErrorInfo | ErrorInfo object describing error if an error occurred |
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
| technicalUser | Boolean | true if userId represents a technical user, false or not specified otherwise |
| userId | String | User id |
| errorInfo | ErrorInfo | ErrorInfo object describing error if an error occurred |
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
| licensedItemId | String | Licensed item id |
| licenseId | String | License id |
| entitlementId | String | Entitlement id |
| licenseAnchors | List | List of LicenseAnchorIdFields objects |
| leaseId | String | Lease id |
| consumptionMode | String | Consumption mode: "cache" for online use or "checkout" for offline use |
| consumedVersion | String | Consumed version |
| licensedItemName | String | Licensed item name |
| consumptionId | String | Consumption id |
| technicalUser | Boolean | true if userId represents a technical user, false or not specified otherwise |
| userId | String | User id |
| errorInfo | ErrorInfo | ErrorInfo object describing error if an error occurred |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |

#### LicenseConsumed

*License has been consumed.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| licenseOwnerUserId | String | Id of licensee if licensee is a user |
| licenseOwnerOrganizationId | String | Id of licensee if licensee is an organization |
| licensedItemId | String | Licensed item id |
| licenseId | String | License id |
| entitlementId | String | Entitlement id |
| licenseAnchors | List | List of LicenseAnchorIdFields objects |
| leaseId | String | Lease id |
| consumptionMode | String | Consumption mode: "cache" for online use or "checkout" for offline use |
| consumedVersion | String | Consumed version |
| licensedItemName | String | Licensed item name |
| consumptionId | String | Consumption id |
| technicalUser | Boolean | true if userId represents a technical user, false or not specified otherwise |
| userId | String | User id |
| errorInfo | ErrorInfo | ErrorInfo object describing error if an error occurred |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |

#### LicenseReleased

*License consumption has been released.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| licenseOwnerUserId | String | Id of licensee if licensee is a user |
| licenseOwnerOrganizationId | String | Id of licensee if licensee is an organization |
| licensedItemId | String | Licensed item id |
| licenseId | String | License id |
| entitlementId | String | Entitlement id |
| licenseAnchors | List | List of LicenseAnchorIdFields objects |
| leaseId | String | Lease id |
| technicalUser | Boolean | true if userId represents a technical user, false or not specified otherwise |
| userId | String | User id |
| errorInfo | ErrorInfo | ErrorInfo object describing error if an error occurred |
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
| technicalUser | Boolean | true if userId represents a technical user, false or not specified otherwise |
| userId | String | User id |
| authenticatedSessionId | String | Authenticated session id |
| clientApplicationType | String | Client application type, or unspecified if not a client application request |
| clientApplicationId | String | Client application id, or unspecified if not a client application request |
| providerId | String | Provider id, or unspecified if not a provider request  |
| providerType | String | Provider type, or unspecified if not a provider request |
| duration | Long | Request duration |
| tenantId | String | Tenant id |
| errorInfo | ErrorInfo | ErrorInfo object describing error if an error occurred |

### Audit

Audit trail events.

#### Created

*An entity has been created in the system.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| technicalUser | Boolean | true if userId represents a technical user, false or not specified otherwise |
| userId | String | User id |
| objectName | String | Object type name |
| objectId | String | Object id |
| modifiedFields | Object | Map with modified object fields |

#### Deleted

*An entity has been deleted from the system.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| technicalUser | Boolean | true if userId represents a technical user, false or not specified otherwise |
| userId | String | User id |
| objectName | String | Object type name |
| objectId | String | Object id |

#### Read

*An entity has been read.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| technicalUser | Boolean | true if userId represents a technical user, false or not specified otherwise |
| userId | String | User id |
| objectName | String | Object type name |
| objectId | String | Object id |

#### Updated

*An entity has been updated.*

| Field name | Type | Description |
| ---        | ---  | ---         |
| eventTime | Long | Milliseconds since 1970-01-01T00:00:00Z (UTC) |
| requestId | String | Request id |
| technicalUser | Boolean | true if userId represents a technical user, false or not specified otherwise |
| userId | String | User id |
| objectName | String | Object type name |
| objectId | String | Object id |
| modifiedFields | Object | Map with modified object fields |
