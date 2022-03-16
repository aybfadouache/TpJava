package pres;

import dao.iDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {

        Scanner scanner= new Scanner(new File("config.txt"));

        String daoClassName = scanner.nextLine();
        Class cDao=Class.forName(daoClassName);
        iDao dao=(iDao) cDao.newInstance();

        String metierClassName=scanner.nextLine();
        Class cMetier= Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.newInstance();

        Method method=cMetier.getMethod("setDao", iDao.class);
        method.invoke(metier, dao);

        System.out.println("Résultat =>"+metier.calcul());

    }
}
