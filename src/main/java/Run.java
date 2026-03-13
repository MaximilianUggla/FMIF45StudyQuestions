import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Run {
    private static final String startPath = "src/main/resources/";

    public static void main(String[] args) {
        List<String> files = getNames();

        Map<String, String[]> map = new HashMap<String, String[]>();

        for (String fileName : files) {
            Scanner scan = null;
            try {
                scan = new Scanner(new File(fileName));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }


            String str = "";

            while (scan.hasNextLine()) {
                str += scan.nextLine();
            }

            map.put(fileName, str.split("////"));
        }

        Set<Map.Entry<String, String[]>> quizzes = map.entrySet();
        for (Map.Entry<String, String[]> quiz : quizzes) {
            System.out.println(quiz.getKey() + ":\n");
            for (String question_answer : quiz.getValue()) {
                String[] parts = question_answer.split("//");
                System.out.println(parts[0]);
                Scanner scan = new Scanner(System.in);
                System.out.println("Press enter to reveal answer: ");
                String answer = scan.nextLine();
                System.out.println(parts[1]);
                System.out.println();
                System.out.println("Press enter to reveal next question: ");
                String press = scan.nextLine();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
            }
        }
    }

    private static List<String> getNames() {
        List<String> files = new ArrayList<String>();
        files.add(startPath + "Introduktion till begreppet hållbar utveckling.txt");
        files.add(startPath + "Lokala och regionala luftföroreningar.txt");
        files.add(startPath + "Energi.txt");
        files.add(startPath + "Klimat - vetenskap och politik.txt");
        files.add(startPath + "Naturresurser och hållbarhet.txt");
        files.add(startPath + "Miljögifter och toxiska metaller.txt");
        files.add(startPath + "Avfallshantering och resurshushållning.txt");
        files.add(startPath + "Hållbar utveckling i ett företagsperspektiv.txt");
        files.add(startPath + "Företagens miljöverktyg: LCA och ekodesign.txt");
        files.add(startPath + "Hållbar AI.txt");
        files.add(startPath + "Styrmedel- miljöpolitikens verktyg.txt");
        return files;
    }
}