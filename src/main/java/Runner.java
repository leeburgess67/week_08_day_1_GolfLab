import db.DBGolfer;
import models.Golfer;
import models.Golfer;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Golfer golfer1 = new Golfer("Tiger", "Woods", 32);
        DBGolfer.save(golfer1);


        Golfer golfer2 = new Golfer("Ernie", "Els", 40);
        DBGolfer.save(golfer2);

        Golfer golfer3 = new Golfer("Jordan", "Speith", 23);
        DBGolfer.save(golfer3);

        Golfer golfer4 = new Golfer("Putter", "Away", 24);
        DBGolfer.save(golfer4);

        Golfer golfer5 = new Golfer("Swingan", "Amiss", 15);
        DBGolfer.save(golfer5);

        List<Golfer> Golfers = DBGolfer.getAll();

        Golfer tiger = DBGolfer.find(golfer1.getId());
        Golfer golfers = DBGolfer.findByFirstName("Putter");

        System.out.println(tiger.getFirstName());

        System.exit(0 );

    }
}
