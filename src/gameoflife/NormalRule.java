package gameoflife;

public class NormalRule extends Rule {

    private final boolean[] survivalRule = new boolean[9];
    private final boolean[] creatRule = new boolean[9];
    private final String name, rule;

    public NormalRule(String name, String rule) {
        this.name = name;
        this.rule = rule;
        setRule(rule);
    }

    public void setRule(String rule) {
        if (!rule.contains("/")) {
            throw new IllegalArgumentException();
        }
        String survive = rule.split("/")[0];
        String creat = rule.split("/")[1];
        for (int i = 0; i < survivalRule.length; i++) {
            survivalRule[i] = survive.contains("" + i);
            creatRule[i] = creat.contains("" + i);
        }
    }

    @Override
    public boolean isLive(int x, int y, Scales scales) {
        int aliveN = 0;
        boolean n[] = scales.getNeighbour(x, y);
        for (boolean b : n) {
            aliveN += (b ? 1 : 0);
        }
        return (scales.getAt(x, y))
                ? (survivalRule[aliveN])
                : (creatRule[aliveN]);
    }
//next are set and get
    @Override
    public String getName() {
        return name;
    }

    public boolean[] getSurvivalRule() {
        return survivalRule;
    }

    public boolean[] getCreatRule() {
        return creatRule;
    }

    @Override
    public String toString() {
        return getName();
    }
}
