public class AskPermissionActivity extends AppCompatActivity {
  
    // Any number for callback. Change as you wish!
    private static final int PERMISSION_ACCESS_CODE = 2016;
  
    // Check for missing permissions and ask only required ones!
    private void checkPermissions() {
        List<String> permissions = new ArrayList<>();

        // Template for ask permission
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.GET_ACCOUNTS) == PackageManager.PERMISSION_DENIED) {
            // add in AndroidManifest.xml: <uses-permission android:name="android.permission.GET_ACCOUNTS" />
            permissions.add(Manifest.permission.GET_ACCOUNTS);
        }

        // .... add more as neccessary
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) == PackageManager.PERMISSION_DENIED) {
            // add in AndroidManifest.xml: <uses-permission android:name="android.permission.CAMERA" />
            permissions.add(Manifest.permission.CAMERA);
        }

        // Requesting permissions if necessary or continue with
        // any your created logic/method/function
        if (permissions.size() > 0) {
            ActivityCompat.requestPermissions(this, permissions.toArray(new String[permissions.size()]), PERMISSION_ACCESS_CODE);
        } else {
            main();
        }
    }
  
    // Receiving callback from "Android Permission Dialog"
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case PERMISSION_ACCESS_CODE: {
                for (int result : grantResults) {
                    if (result == PackageManager.PERMISSION_DENIED) {
                        // Some of permission denied! Show error message to user and exit.
                        tellApplicationNeedPermission();
                        return;
                    }
                }
                allPermissionsGranted();
            }
        }
    }

    // Show alert dialog and exit
    private void tellApplicationNeedPermission() {
        new android.support.v7.app.AlertDialog.Builder(this)
                .setTitle("Application Require Permission")
                .setMessage("Application does not have required permissions to run properly!")
                .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // Any logic to exit application after "Error dialog" closing
                        finish();
                    }
                })
                .show();
    }
    
    // All permissions granted! You can write your own logic
    // to start new activity or continue with some other method.
    private void allPermissionsGranted() {
        // Start MainActivity
        startActivity(new Intent(this, MainActivity.class));
        StartActivity.this.finish();
    }
    
}
