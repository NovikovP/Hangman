package com.successdca;

public enum Scaffold {
    ZERO {
        @Override
        public String toString() {
            return "     " + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + "\n" +
                    "         " + (char) 124 + "\n" +
                    "         " + (char) 124 + "\n" +
                    "         " + (char) 124 + "\n" +
                    "         " + (char) 124 + "\n" +
                    (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 124;
        }
    },
    ONE {
        @Override
        public String toString() {
            return "     " + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + "\n" +
                    "    " + (char) 79 + "    " + (char) 124 + "\n" +
                    "         " + (char) 124 + "\n" +
                    "         " + (char) 124 + "\n" +
                    "         " + (char) 124 + "\n" +
                    (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 124;
        }
    },
    TWO {
        @Override
        public String toString() {
            return "     " + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + "\n" +
                    "    " + (char) 79 + "    " + (char) 124 + "\n" +
                    "    " + (char) 124 + "    " + (char) 124 + "\n" +
                    "    " + (char) 124 + "    " + (char) 124 + "\n" +
                    "         " + (char) 124 + "\n" +
                    (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 124;
        }
    },
    THREE {
        @Override
        public String toString() {
            return "     " + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + "\n" +
                    "    " + (char) 79 + "    " + (char) 124 + "\n" +
                    "  " + (char) 45 + (char) 45 + (char) 124 + "    " + (char) 124 + "\n" +
                    "    " + (char) 124 + "    " + (char) 124 + "\n" +
                    "         " + (char) 124 + "\n" +
                    (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 124;
        }
    },
    FOUR {
        @Override
        public String toString() {
            return "     " + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + "\n" +
                    "    " + (char) 79 + "    " + (char) 124 + "\n" +
                    "  " + (char) 45 + (char) 45 + (char) 124 + (char) 45 + (char) 45 + "  " + (char) 124 + "\n" +
                    "    " + (char) 124 + "    " + (char) 124 + "\n" +
                    "         " + (char) 124 + "\n" +
                    (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 124;
        }
    },
    FIVE {
        @Override
        public String toString() {
            return "     " + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + "\n" +
                    "    " + (char) 79 + "    " + (char) 124 + "\n" +
                    "  " + (char) 45 + (char) 45 + (char) 124 + (char) 45 + (char) 45 + "  " + (char) 124 + "\n" +
                    "    " + (char) 124 + "    " + (char) 124 + "\n" +
                    "   " + (char) 47 + "     " + (char) 124 + "\n" +
                    (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 124;
        }
    },
    SIX {
        @Override
        public String toString() {
            return "     " + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + "\n" +
                    "    " + (char) 79 + "    " + (char) 124 + "\n" +
                    "  " + (char) 45 + (char) 45 + (char) 124 + (char) 45 + (char) 45 + "  " + (char) 124 + "\n" +
                    "    " + (char) 124 + "    " + (char) 124 + "\n" +
                    "   " + (char) 47 + " " + (char) 92 + "   " + (char) 124 + "\n" +
                    (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 95 + (char) 124;
        }
    }
}
