package com.xworkz.subscriptionapp;

import com.xworkz.subscriptionapp.subscription.Subscription;
import com.xworkz.subscriptionapp.subscription.impl.SubscriptionImpl;

public class SubscriptionRunner {
    public static void main(String[] args) {
        Subscription subscription = new SubscriptionImpl();
        subscription.subscribe();
        subscription.renewSubscription();
        subscription.unsubscribe();
    }
}
