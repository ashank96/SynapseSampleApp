package com.nuclei.core;

import android.util.Log;

import com.nuclei.synapseabstract.ISynapse;
import com.nuclei.synapseabstract.ISynapseCallback;

public class CoreApplication {
    private static final String TAG = CoreApplication.class.getSimpleName();
    ISynapse iSynapse;
    private static CoreApplication coreApplication;
    private CoreApplication(){ }
    public static CoreApplication newInstance() {
        if(coreApplication==null){
            coreApplication = new CoreApplication();
        }
        return coreApplication;
    }

    public CoreApplication build(){
        try {
            iSynapse = (ISynapse) Class.forName("com.nuclei.synapse.Synapse").newInstance();
            iSynapse.setSynapseCallback(new ISynapseCallback() {
                @Override
                public void onLoginDone(String message) {
                    Log.i(TAG, "seamless login done");
                }
            });
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return coreApplication;
    }

    public void openSynapse() {
        iSynapse.doSeamlessLogin("do seamless login");
    }

}
