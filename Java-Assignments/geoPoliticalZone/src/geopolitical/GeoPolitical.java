package geopolitical;

public class GeoPolitical {

        public static String getZone(String state) {
                String userState = state.toUpperCase();

                try {
                        GeoPoliticalZone zone = GeoPoliticalZone.valueOf(userState);
                        return zone.getZone();
                }

                catch (IllegalArgumentException e) {
                        throw new IllegalArgumentException("Invalid State");
                }

        }
}