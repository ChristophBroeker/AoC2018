package de.christophbroeker;

public class Main {

    public static void main(String[] args) {
        String units = "";
        String result = analyzePolymer(units);
        System.out.println(result.length());
    }

    /**
     *
     * @param startPolymer The startPolymer
     * @return The shorted polymer.
     */
    static String analyzePolymer(String startPolymer){
        Result result = new Result("", new StringBuilder());

        for ( int indexFirstUnit = 0; indexFirstUnit < startPolymer.length(); indexFirstUnit ++ ) {
            boolean isLast = (indexFirstUnit + 1) == startPolymer.length();
            String secondUnit = startPolymer.substring(indexFirstUnit, indexFirstUnit + 1 );
            result = compare(result.getUnit(), secondUnit, result.getResultPolymer(), isLast);
        }
        return result.getResultPolymer().toString();
    }

    /**
     *
     * @param firstUnit The first unit to compare.
     * @param secondUnit The second unit to compare.
     * @param resultPolymer The current result polymer.
     * @param isLast If the second unit is the last unit.
     * @return A {@link Result} containing the current result polymer and the next first unit.
     */
    private static Result compare(String firstUnit, String secondUnit, StringBuilder resultPolymer, boolean isLast){
        boolean areDifferentTypes = !firstUnit.equals(secondUnit);
        boolean areSameTypeAndPolarity = firstUnit.equalsIgnoreCase(secondUnit);

        if (areDifferentTypes && areSameTypeAndPolarity){
            return delete(resultPolymer);
        }else{
            return add(resultPolymer, firstUnit, secondUnit, isLast);
        }
    }

    /**
     *
     * @param resultPolymer The current result polymer.
     * @return A {@link Result} containing the current result polymer and the next first unit.
     */
    private static Result delete(StringBuilder resultPolymer){
        if(resultPolymer.length() > 0){
            int firstIndex = resultPolymer.length() - 1;
            int secondIndex = resultPolymer.length();
            String firstUnit = resultPolymer.substring(firstIndex, secondIndex);

            resultPolymer.delete(firstIndex, secondIndex);
            return new Result(firstUnit, resultPolymer);
        }else{
            return new Result("", resultPolymer);
        }
    }

    /**
     *
     * @param resultPolymer The current result polymer.
     * @param firstUnit The first unit of comparison.
     * @param secondUnit The second unit of comparison.
     * @param isLast The second unit is the last of the start polymer.
     * @return A {@link Result} containing the current result polymer and the next first unit.
     */
    public static Result add(StringBuilder resultPolymer, String firstUnit, String secondUnit, boolean isLast){
        resultPolymer.append(firstUnit);
        if(isLast){
            resultPolymer.append(secondUnit);
        }
        return new Result(secondUnit, resultPolymer);
    }
}
