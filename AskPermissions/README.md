#HELLO

// Ask for all permissions at once. If any permission 
// is denyed the application will exit. If all permissions
// granted continue with MainActivity
//
// Basic logic:
//      1. Thnk of any number for               PERMISSION_ACCESS_CODE
//      2. Check permissions                    checkPermissions()
//      3. Receive answer                       onRequestPermissionsResult()
//      4. Exit if missing permissin            tellApplicationNeedPermission()
//      5. Success if all permissins granted    allPermissionsGranted()
