package com.progx73.tuneplz;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;
import android.app.Activity;
import android.content.Intent;

public class TunePlz extends CordovaPlugin {
    public static final String ACTION_ADD_TUNE_PLZ = "tunePlz";


    @Override
    public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {


        try {
            if (ACTION_ADD_TUNE_PLZ.equals(action)) {
                JSONObject arg_object = args.getJSONObject(0);
               
            alert("test");
              /*Intent calIntent = new Intent(MainRecSoundActivity.class);
             
               this.cordova.getActivity().startActivity(calIntent);
               callbackContext.success();
               return true;
               
                //Sur le UI Thread
                /*cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                         // Main Code goes here
                   
                   new  MainRecSoundActivity();
                    
                    
                   
                    
                         callbackContext.success(); 
                     }
                 });
                //Threzad separé
                /*cordova.getThreadPool().execute(new Runnable() {
                public void run() {
                        // Main Code goes here
                        callbackContext.success(); 
                    }
                });*/
                
                callbackContext.success();
                return true;
            }
            callbackContext.error("Invalid action");
            return false;
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
            callbackContext.error(e.getMessage());
            return false;
        }

    }
}
