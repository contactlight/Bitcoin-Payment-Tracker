Bitcoin-Payment-Tracker
=======================

A simple to setup and robust Bitcoin Payment Tracker that connects to a local or remote 'bitcoind' instance in order to manage incoming transactions and balances.

It is intended for developers who want to use bitcoind on their website to accept payments instead of relying on services such as BlockNotify. In much simpler terms, this project can be considered a local BlockNotify instance. Through an HTTP endpoint, it can be instructed to create new bitcoin addresses and watch them for incoming transactions. Once the transaction is received, your application will be notified, and the funds will be transferred to an address of your choice. This can be your paper wallet or something else of your choice.

It is currently in very early stage development and should not be used for anything on the production network.
