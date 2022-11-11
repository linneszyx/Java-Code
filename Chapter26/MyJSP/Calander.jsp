<%!
public String FormatTitle(java.util.Calendar thisCal) 
{
java.text.SimpleDateFormat formatter =
new java.text.SimpleDateFormat ("MMMMMMMMM d, yyyy");
return (formatter.format(thisCal.getTime()));
}
%>

<%
java.util.Calendar currentCal =
java.util.Calendar.getInstance();
%>

<HTML>
<HEAD>
<TITLE>Calendar</TITLE>
<STYLE TYPE="text/css">
<!-
TD 
{
font-family: Arial, Helvetica, sans-serif;
font-size: 10pt; text-align: center;
}
.currentDay 
{
color: #FF0000; background-color: #EEEEEE;
}
.otherDay 
{
color: #666699; background-color: #EEEEEE;
}
.dayHeading 
{
font-size: 9pt; color: #666699;
}
.titleStyle 
{
font-size: 14pt; color: #FFFFFF;
background-color: #666699; text-align: center;
font-weight: bold;
}
-->
</STYLE>
</HEAD>
<BODY>
<TABLE BORDER='0' CELLPADDING='1' CELLSPACING='2'>
<TR><TD CLASS='titleStyle' COLSPAN='7'>
<%= FormatTitle(currentCal) %>
</TD></TR>
<TR>
<TD WIDTH=14% CLASS='dayHeading'>SUN</TD>
<TD WIDTH=14% CLASS='dayHeading'>MON</TD>
<TD WIDTH=14% CLASS='dayHeading'>TUE</TD>
<TD WIDTH=14% CLASS='dayHeading'>WED</TD>
<TD WIDTH=14% CLASS='dayHeading'>THU</TD>
<TD WIDTH=14% CLASS='dayHeading'>FRI</TD>
<TD WIDTH=14% CLASS='dayHeading'>SAT</TD>
</TR>

<% 
int currentDay =
currentCal.get(currentCal.DAY_OF_MONTH);
int daysInMonth =
currentCal.getActualMaximum(currentCal.DAY_OF_MONTH);
currentCal.set(currentCal.DAY_OF_MONTH, 1);
int dayOfWeek = currentCal.get(currentCal.DAY_OF_WEEK);
if (dayOfWeek != 1) {
out.println(" <TD COLSPAN=" + (dayOfWeek-1) +
">&nbsp;</TD>");
}
for (int day=1; day <= daysInMonth; day++) {
if (day == currentDay) {
out.println(" <TD CLASS='currentDay'>" + day +
"</TD>");
} else {
out.println(" <TD CLASS='otherDay'>" + day +
"</TD>");
}
if (dayOfWeek == 7) {
out.println(" </TR>\n\n <TR>");
dayOfWeek = 1;
} else {
dayOfWeek++;
}
}
if ((8-dayOfWeek) != 0) {
out.println(" <TD COLSPAN=" + (8-dayOfWeek) +
">&nbsp;</TD>");
}
%>
</TR>
</TABLE>
</BODY>
</HTML>