package enumTest;

public enum States {

        FIRST("1"),
        SECOND("2"),
        THIRD("3"),
        FOURTH("4"),
        SIX("5"),
        SEVEN("6"),
        EIGHT("7");



        public final String displayName;

        States(String displayName) {
            this.displayName = displayName;
        }


    @Override public String toString() {
            return displayName; }
    }
