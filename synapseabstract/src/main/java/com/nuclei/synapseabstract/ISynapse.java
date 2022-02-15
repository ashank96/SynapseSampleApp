package com.nuclei.synapseabstract;
// for communication from core/app to synapse
public abstract class ISynapse {
    public abstract void doSeamlessLogin(String message);
    public abstract void setSynapseCallback(ISynapseCallback callback);
}
