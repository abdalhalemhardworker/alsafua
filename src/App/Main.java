package App;

import Entities.Importer;
import Repos.ImporterRepo;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Importer importer = new Importer();
//        importer.setCompanyName("ثمار الخليج");
//        importer.setCountryName("الكويت");
//        
//        ImporterRepo.add_new(importer);
//        
//        List<Importer> importers = ImporterRepo.get_all();
//        for (Importer importer1 : importers) {
//            System.out.println(importer1);
//        }
        new MainForm().main(args);
    }
}
