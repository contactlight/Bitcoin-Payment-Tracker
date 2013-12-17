package com.contactlight.bitcoin.tracker;

public class Main {

    public static void main(String[] args) {
        BitcoinProcessor proc = null;

        // This node is running on testnet3, not the main network
        try { proc = new BitcoinProcessor("ohGreatRPC", "kp5g6dIsGreat", "50.116.0.218", 8332); }
        catch (Exception e) { }

        if (proc == null)
            return;

        proc.startAcceptor(0);

        try { while(true) Thread.sleep(1000); }
        catch (Exception e) { }
    }

}
