# Ask Permissions properly

#### Ask for all permissions at once. If any permission is denied the application will exit. If all permissions granted continue with MainActivity.

## Basic logic:
1. Thnk of any number for ----------------- PERMISSION_ACCESS_CODE
2. Check permissions ---------------------- checkPermissions()
3. Receive answer ------------------------- onRequestPermissionsResult()
4. Exit if missing permissin --------------- tellApplicationNeedPermission()
5. Success if all permissins granted ------ allPermissionsGranted()

## Permissions that require this method
* Calendar (Group)
  * READ_CALENDAR (Permission)
  * WRITE_CALENDAR (Permission)
* Camera
  * CAMERA
* Contacts
  * READ_CONTACTS
  * WRITE_CONTACTS
  * GET_ACCOUNTS
* Location
  * ACCESS_FINE_LOCATION
  * ACCESS_COARSE_LOCATION
* Microphone
  * RECORD_AUDIO
* Phone
  * READ_PHONE_STATE
  * CALL_PHONE
  * READ_CALL_LOG
  * WRITE_CALL_LOG
  * ADD_VOICEMAIL
  * USE_SIP
  * PROCESS_OUTGOING_CALLS
* Sensors
  * BODY_SENSORS
* Sms
  * SEND_SMS
  * RECEIVE_SMS
  * READ_SMS
  * RECEIVE_WAP_PUSH
  * RECEIVE_MMS
* Storage
  * READ_EXTERNAL_STORAGE
  * WRITE_EXTERNAL_STORAGE
