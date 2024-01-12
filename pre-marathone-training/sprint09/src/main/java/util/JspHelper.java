package util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class JspHelper {
    private static final String DIRECTORY = "WEB-INF/jsp/%s.jsp";

    public static String getPath(String jspName) {
        return String.format(DIRECTORY, jspName);
    }
}
