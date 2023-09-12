## LoginPage
Technology Used :- JSP, Eclipse, Apache Tomcat-9.0, Servlet, MySQL-mysql- connector-java-8.0.13.jar,html,css
***************************************************************************************************************************
Login.jsp>>Creatinglogin form with fields for email and password, a login button, and a link to another page for signing in. 
>It also includes some styling with the referenced CSS files and uses Font Awesome icons for visual elements.
>Keep in mind that this is a basic explanation, and the actual functionality might depend on other parts of your application, such as the "validateLogin" URL and the handling of form submission on the server side.
****************************************************************************************************************************
Signin.jsp>> After click in sign in button click The action attribute specifies the URL (or relative path) to which the form data will be submitted. In this case, the form data will be sent to a URL named "savesignin".
>The method attribute is set to "post", indicating that the form data will be included in the request body.
>Inside the form, there's a <pre> element that preserves whitespace formatting.

>A series of <input> elements are provided for the user to enter their name, phone, email, password, and confirmation password.
>The type attribute is set to "text" for text input.
>The name attribute specifies the name of the input field, which is used to identify the data when the form is submitted.
>A submit button (<input> of type "submit") labeled "Signin" allows the user to submit the form.
>The </pre> and </form> tags close the <pre> element and the form, respectively.

>This code creates a sign-up form with fields for entering user details, and it applies styles to achieve specific visual elements such as the background image and layout. 
>As with any web form, the actual functionality likely depends on the server-side logic that processes the form submission (in this case, "savesignin").
********************************************************************************************************************************
LHome.jsp>>JSP code creates a web page that includes a background image and a navigation bar.
>> The navigation bar contains links for adding a contact, viewing contacts, and logging out.
>> The visibility of the navigation bar depends on whether the "email" attribute is present in the user's session, indicating whether the user is logged in or not.
>>If the "email" attribute is present, the navigation bar is displayed; otherwise, it's not shown.
>> ******************************************************************************************************************************
add.jsp>>This JSP code creates a form for adding contact information (name, phone) and includes the user's email as a hidden input field.
>> The form data will be submitted to the "addcontact" URL. The page has a background image and is displayed when the user is logged in (based on the presence of the "email" attribute in the session).
*********************************************************************************************************************************
view.jsp>>JSP code creates a page that displays a list of contacts for a logged-in user. 
>>It retrieves contact information from the database using the ContactDao class and displays it in an HTML table. 
>>The page has a background image and is designed to be shown when the user is logged in. If the user is not logged in, they are redirected to the "Login1.jsp" page.


#output
![image](https://github.com/scanurag/LoginPage/assets/90509642/0d02d812-f1d7-4ba4-8f5e-f6362856dbe0)
![image](https://github.com/scanurag/LoginPage/assets/90509642/33bca9ea-7a88-4bbc-8e44-d186456dc61d)
![image](https://github.com/scanurag/LoginPage/assets/90509642/617557d7-4b91-4ffd-a287-109e6db6ed2a)
![image](https://github.com/scanurag/LoginPage/assets/90509642/4ea97526-9458-4a0d-a2c9-a29e4d4f7dd2)
![image](https://github.com/scanurag/LoginPage/assets/90509642/bb5fd593-e763-479d-827c-9d9a3cea49bd)
![image](https://github.com/scanurag/LoginPage/assets/90509642/00692dd1-555c-4e03-82bd-ddd7666eb5d5)
![image](https://github.com/scanurag/LoginPage/assets/90509642/82ba96a1-62be-4b6b-afed-7e050c0e6a48)
![image](https://github.com/scanurag/LoginPage/assets/90509642/fe265e62-a601-418d-a798-a365ec7f9d85)
![image](https://github.com/scanurag/LoginPage/assets/90509642/07d0d20e-6f97-4f79-85fc-faa776d058c7)








