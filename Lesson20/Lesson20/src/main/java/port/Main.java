package port;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import port.ship.Ship;
import port.suppliers.BrickSupplier;
import port.suppliers.SteelSupplier;
import port.suppliers.WoodSupplier;

public class Main{

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        Ship ship = context.getBean("ShipBean", Ship.class);
        Ship ship1 = context.getBean("ShipBean1", Ship.class);
        Ship ship2 = context.getBean("ShipBean2", Ship.class);
        System.out.println(ship.getCargo().size() + " " + ship.getType());
        System.out.println(ship1.getCargo().size() + " " + ship1.getType());
        System.out.println(ship2.getCargo().size() + " " + ship2.getType());
        Port port = context.getBean("PortBean", Port.class);
        BrickSupplier bs = context.getBean("BrickSupplierBean", BrickSupplier.class);
        WoodSupplier ws = context.getBean("WoodSupplierBean", WoodSupplier.class);
        SteelSupplier ss = context.getBean("SteelSupplierBean", SteelSupplier.class);
        new Thread(bs).start();
        new Thread(ws).start();
        new Thread(ss).start();

        ExecutorService shipping = Executors.newFixedThreadPool(port.getCraneNum());
        shipping.submit(context.getBean("CraneBean", Crane.class));
        shipping.submit(context.getBean("CraneBean1", Crane.class));
        shipping.submit(context.getBean("CraneBean2", Crane.class));
        shipping.shutdown();

        context.close();
    }

}