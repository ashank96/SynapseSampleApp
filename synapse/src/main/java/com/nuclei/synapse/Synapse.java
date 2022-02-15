package com.nuclei.synapse;

import android.util.Log;

import com.nuclei.synapseabstract.ISynapse;
import com.nuclei.synapseabstract.ISynapseCallback;

public class Synapse extends ISynapse {
    private static final String TAG = Synapse.class.getSimpleName();
    private ISynapseCallback callback;

    @Override
    public void doSeamlessLogin(String message) {
        Log.i(TAG, message);
        callback.onLoginDone("login done");
    }

    @Override
    public void setSynapseCallback(ISynapseCallback callback){
        this.callback = callback;
    }
}
