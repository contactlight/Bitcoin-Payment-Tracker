package com.contactlight.bitcoin.tracker;

import com.azazar.bitcoin.jsonrpcclient.*;

public class BitcoinProcessor {
    private Bitcoin conn = null;
    private BitcoinAcceptor acceptor;
    public BitcoinProcessor(String username, String password, String hostname, int port) throws Exception{
        conn = new BitcoinJSONRPCClient( "http://" + username + ":" + password + "@" +
                hostname + ":" + Integer.toString(port) );

        for( Bitcoin.ReceivedAddress addr : conn.listReceivedByAddress(0, true) ){
            System.out.println(addr.address() + " " + addr.amount());
        }
    }

    public void startAcceptor(int minConfirmation){
        acceptor = new BitcoinAcceptor(conn, null, 0); // new BitcoinAcceptor(conn);
        Debug.log("Initializing the acceptor");

        acceptor.addListener( new TransactionEventProcessor() );
        acceptor.run();
    }

    public void stopAcceptor(){
        acceptor.stopAccepting();
    }

    public double getBalance() throws BitcoinException{
        if(conn == null)
            return -1;
        return conn.getBalance();
    }
}
