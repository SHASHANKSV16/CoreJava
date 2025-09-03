package com.xworkz.watchapp;

import com.xworkz.watchapp.watch.Watch;
import com.xworkz.watchapp.watchshop.WatchShop;

public class WatchRunner {
    public static void main(String[] args) {
        Watch watch1=new Watch(1,"P47","Titan",1500.00,"5 years");
        Watch watch2=new Watch(2,"A123","Casio",1200.00,"3 years");
        Watch watch3=new Watch(3,"X200","Fossil",2500.00,"2 years");
        Watch watch4=new Watch(4,"G5","Timex",900.00,"1 year");
        Watch watch5=new Watch(5,"R789","Sonata",700.00,"2 years");
        Watch watch6=new Watch(6,"V11","Seiko",3500.00,"5 years");
        Watch watch7=new Watch(7,"L99","Omega",55000.00,"10 years");
        Watch watch8=new Watch(8,"P50","Rolex",150000.00,"10 years");
        Watch watch9=new Watch(9,"C33","Tag Heuer",75000.00,"5 years");



        WatchShop watchShop =new WatchShop();

        if(watchShop.addWatch(watch1)&&watchShop.addWatch(watch2)&&watchShop.addWatch(watch3)&&
                watchShop.addWatch(watch4)&&watchShop.addWatch(watch5)&&watchShop.addWatch(watch6)&&
                watchShop.addWatch(watch7)&&watchShop.addWatch(watch8)&&watchShop.addWatch(watch9)){
            watchShop.getWatchDetails();
        }


    }
}
