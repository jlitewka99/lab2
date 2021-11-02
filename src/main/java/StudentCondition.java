public enum StudentCondition {
    ODRABIAJĄCY{
        @Override
        public String toString() {
            return "ODRABIAJĄCY";
        }
    },
    CHORY{
        @Override
        public String toString() {
            return "CHORY";
        }
    },
    NIEOBECNY{
        @Override
        public String toString() {
            return "NIEOBECNY";
        }
    }

}
