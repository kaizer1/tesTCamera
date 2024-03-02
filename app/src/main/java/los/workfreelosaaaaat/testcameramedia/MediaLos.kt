package los.workfreelosaaaaat.testcameramedia

import android.app.Activity
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.core.app.ActivityCompat


fun adPer(act : Activity){

           if (ActivityCompat.checkSelfPermission(act, android.Manifest.permission.BLUETOOTH_SCAN) != PackageManager.PERMISSION_GRANTED ||
               ActivityCompat.checkSelfPermission( act, android.Manifest.permission.BLUETOOTH_CONNECT) != PackageManager.PERMISSION_GRANTED ||
               ActivityCompat.checkSelfPermission(act, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
        ) {



            ActivityCompat.requestPermissions(act, arrayOf(android.Manifest.permission.CAMERA, android.Manifest.permission.FOREGROUND_SERVICE_CAMERA), 81)
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return
        }


}


class MediaLos : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




//          val intent = createIntent().apply {
//            putExtra(MediaStore.EXTRA_OUTPUT, videoUri)
//        }



    }
}