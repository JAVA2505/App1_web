<%@ page import="java.util.HashMap" %>
<%@ page import="entity.Item" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%!
    Map<Item, Integer> myMap = new HashMap<>();
    int allSum = 0;
%>
<html>
<head>
    <title>
        Cart
    </title>
</head>
<body>
<div id='header' style='height: 83px; background-color: aqua'>
    <table width='100%' class='goods'>
        <tr>
            <td width='60px' align='left'>
                <img src='http://i.piccy.info/i9/db895864e575cb3520c8dd7bfe21a74c/1539106022/1226/1226734/logo.png'
                     style='height: 50px'/>
            </td>
            <td width='200px' align='left'>
                <h1>Weed Store</h1>
            </td>
            <td align='right' width='100px'>
                <h4>
                    <a href='/App1_web/cart'>Cart</a>
                </h4>
            </td>
            <td align='right' width='100px'>
                <a href='/App1_web/account'><h3>${user.login} </h3></a>

            </td>
        </tr>
    </table>
</div>
<div
        style='background-image: url(http://i.piccy.info/i9/956ac4bcccdc6759946b476394372745/1539107322/12937/1226734/bgMain.png)'>
    <table width='100%'>
        <tr>
            <td align='left'>
                <h1>Your Cart:</h1>
            </td>
            <td width='200px' align='right'>
                <h3><a href='/App1_web/cart?id=0'>Empty cart</a></h3>
                <br>
                <h3><a href='/App1_web/main'>Back</a></h3>
            </td>
        </tr>
    </table>
    <table width='100%' style="width: 100%">

         <%--<c:forEach items="${items}" var="i">

             allSum+=${item.price};
             <c:if test="${!myMap.containsKey(i)}">

                 ${myMap.put(i, 1)};

             </c:if>
             <c:if test="${myMap.containsKey(i)}">

                 ${myMap.put(i, myMap.get(i)+1)};

             </c:if>


         </c:forEach>--%>

        <%
            allSum = 0;
            Map<Item, Integer> myMap = new HashMap<>();
            for(Item i : (List<Item>)request.getAttribute("items")){
                allSum += i.getPrice();
                if(!myMap.containsKey(i)){
                    myMap.put(i, 1);
                }else{
                    myMap.put(i, myMap.get(i)+1);
                }
            }
        %>

           <%
            for(Item i : myMap.keySet()){
                %>

             <tr style='width: 200px; background-color: antiquewhite'>
                 <td align='center'>
                     <h3><% out.println(i.getName()); %></h3>
                     <img src='<% out.println(i.getsImg()); %>' style='height: 200px'/>
                 </td>
                 <td>
                     <table height='400px' width='100%'>
                         <tr style=' background-color: antiquewhite'>
                             <td valign='top'>
                                 <h3>Price:<% out.println(i.getPrice()*myMap.get(i)); %> UAH</h3>
                                 <br>
                                 <h3>Amount: <% out.println(myMap.get(i)); %></h3>
                             </td>
                         </tr>
                         <tr style=' background-color: antiquewhite'>
                             <td>
                                 <h4>Summary: <% out.println(i.getAbout()); %></h4>
                             </td>
                         </tr>
                         <tr style='background-color: antiquewhite'>
                             <td valign='bottom'>
                                 <h4>Category: <% out.println(i.getCat()); %></h4>
                             </td>
                         </tr>
                     </table>
                 </td>
                 <td style='width: 100px'>
                     <h4 align='center'><a href='/App1_web/cart?id=<% out.println(i.getId()); %>'><% out.println(i.getName()); %>++</a></h4>
                     <br>
                     <h4 align='center'><a href='/App1_web/cart?id=-<% out.println(i.getId()); %>'><% out.println(i.getName()); %>--</a></h4>
                 </td>
             </tr>


             <%
            }
            %>





        <%--<c:forEach items="${myMap.keySet}" var="item">

            <tr style='width: 200px; background-color: antiquewhite'>
                <td align='center'>
                    <h3>${item.name}</h3>
                    <img src='${item.sImg}' style='height: 200px'/>
                </td>
                <td>
                    <table height='400px' width='100%'>
                        <tr style=' background-color: antiquewhite'>
                            <td valign='top'>

                                <br>
                                <h3>Amount: <% out.println(myMap.get(request.getAttribute("item"))); %></h3>
                            </td>
                        </tr>
                        <tr style=' background-color: antiquewhite'>
                            <td>
                                <h4>Summary: ${item.about}</h4>
                            </td>
                        </tr>
                        <tr style='background-color: antiquewhite'>
                            <td valign='bottom'>
                                <h4>Category: ${item.cat}</h4>
                            </td>
                        </tr>
                    </table>
                </td>
                <td style='width: 100px'>
                    <h4 align='center'><a href='/App1_web/cart?id=${item.id}'>${item.name}++</a></h4>
                    <br>
                    <h4 align='center'><a href='/App1_web/cart?id=-${item.id}'>${item.name}--</a></h4>
                </td>
            </tr>
        </c:forEach>--%>
    </table>

    <table width='100%'>
        <tr>
            <td align='right'>
                <h2> Total sum: <% out.println(allSum); %> UAH</h2>
            </td>
        </tr>
    </table>

</div>
<div id='footer'>
    <h6 align='center'>Copyright: Alex, Nikitin,...</h6>
</div>
</body>
</html>