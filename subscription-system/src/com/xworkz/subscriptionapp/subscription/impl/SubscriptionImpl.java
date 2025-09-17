package com.xworkz.subscriptionapp.subscription.impl;

import com.xworkz.subscriptionapp.subscription.Subscription;

public class SubscriptionImpl implements Subscription {
    @Override
    public void subscribe() {
        System.out.println("Subscribed successfully");
    }

    @Override
    public void unsubscribe() {
        System.out.println("Unsubscribed successfully");
    }

    @Override
    public void renewSubscription() {
        System.out.println("Subscription renewed successfully");
    }
}
