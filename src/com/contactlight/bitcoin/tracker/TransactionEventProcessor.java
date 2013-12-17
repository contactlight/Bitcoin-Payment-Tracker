package com.contactlight.bitcoin.tracker;

import com.azazar.bitcoin.jsonrpcclient.Bitcoin;
import com.azazar.bitcoin.jsonrpcclient.BitcoinPaymentListener;

class TransactionEventProcessor implements BitcoinPaymentListener {
    @Override
    public void block(String blockHash) {
        Debug.log("Processed block w/ " + blockHash);
    }

    @Override
    public void transaction(Bitcoin.Transaction transaction) {
        // TODO: Need to implement checkpointing
        // HashSet, !processed.add(transaction.txId())
        // followed by acceptor.stopAccepting()
        Debug.log("TRANSACTION ID: " + transaction.txId() + "\n\t\t\t\t\t  TO: " +
                transaction.address() + "\n\t\t\t\t\t  AMOUNT: " +
                transaction.amount() + "\n\t\t\t\t\t  Conf: " + transaction.confirmations());
    }
}