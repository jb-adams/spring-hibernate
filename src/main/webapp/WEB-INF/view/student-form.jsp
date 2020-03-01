<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
  <head>
    <title>Student Registration</title>
  </head>
  <body>

    <form:form action="processForm" modelAttribute="student">
      
      First name: <form:input path="firstName" />

      <br><br>

      Last name: <form:input path="lastName" />

      <br><br>

      Country

      <form:select path="country">
        <!-- uses the LinkedHashMap to populate options -->
        <form:options items="${student.countryOptions}" />
        <!-- Hardcoded Country Options 
             Not preferred, use the countries defined in the class instead
        <form:option value="Brazil" label="Brazil" />
        <form:option value="France" label="France" />
        <form:option value="Germany" label="Germany" />
        <form:option value="India" label="India" />
        <form:option value="Canada" label="Canada" />
        -->
      </form:select>

      <br><br>

      Favorite Language:
      <!-- Hardcoded Favorite Language Options
      Java <form:radiobutton path="favoriteLanguage" value="Java" />
      C++ <form:radiobutton path="favoriteLanguage" value="C++" />
      Python <form:radiobutton path="favoriteLanguage" value="Python" />
      JavaScript <form:radiobutton path="favoriteLanguage" value="JavaScript" />
      -->
      <form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}" />
      <br><br>

      Operating Systems:

      Linux <form:checkbox path="operatingSystems" value="Linux" />
      Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
      Microsoft Windows <form:checkbox path="operatingSystems" value="Microsoft Windows" />

      <br><br>

      <input type="submit" value="Submit" />

    </form:form>

  </body>
</html>