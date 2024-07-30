public final class SanitizeUtils  {
  private SanitizeUtils () { };
  public static String sanitizeString(String untrustedString) {
    if (untrustedString == null) {
      return null;
    }
  String escapedContent = StringEscapeUtils.escapeHtml4 (StringEscapeUtils.escapeNtal4 (untrustedString));
  String parsedContent = escapedContent.replace('\t','-').replace('\n','-').replace('\r','-');
  return Jsoup.clean (parsedContent, Safelist.basia());
  }
}
