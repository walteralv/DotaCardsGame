package Principal;

import com.ugos.jiprolog.engine.*;

import java.io.IOException;

public class Pro {
    public static void main(String[] args) {

        // New instance of prolog engine
        JIPEngine jip = new JIPEngine();

        JIPTerm queryTerm = null;

        // parse query
        try
        {
            // consult file
            jip.consultFile("src\\Principal\\pro.pl");

            queryTerm = jip.getTermParser().parseTerm("mano.");
//                    queryTerm = jip.getTermParser().parseTerm("isMage(X)");
        }
        catch(JIPSyntaxErrorException | IOException ex)
        {
            ex.printStackTrace();
            System.exit(0); // needed to close threads by AWT if shareware
        }

        // open Query
        JIPQuery jipQuery = jip.openSynchronousQuery(queryTerm);
        JIPTerm solution;

        // Loop while there is another solution
//        while (((JIPQuery) jipQuery).hasMoreChoicePoints())
//        {
            solution = jipQuery.nextSolution();
//                    System.out.println(solution);

            JIPVariable[] vars = solution.getVariables();
//            for (JIPVariable var : vars) {
//                if (!var.isAnonymous()) {
//                    //       System.out.print(/*var.getName() + " = " +*/ var.toString(jip) /*+ " "*/);
//                    System.out.println();
//                }
//            }

    }

}