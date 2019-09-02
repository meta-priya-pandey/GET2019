function validateStudentDetails() {
	var first_name = document.forms["studentDetailsform"]["first_Name"].value;
	var first_name_letters = /^([A-Za-z]+[ ]?|[a-z]+)+$/;
	if (first_name == "") {
		document.getElementById('first_Name_error_message').innerHTML = "First Name must be filled out";
		document.getElementById('first_Name_error_message').style.color = "red";
		return false;
	}
	if (first_name.length < 2) {
		document.getElementById('first_Name_error_message').innerHTML = "First Name must contain minimum two character";
		document.getElementById('first_Name_error_message').style.color = "red";
		return false;
	}
	if (!first_name.match(first_name_letters)) {
		document.getElementById('first_Name_error_message').innerHTML = "First Name should not contain any numbers or special character";
		document.getElementById('first_Name_error_message').style.color = "red";
		return false;
	}
	// last name validation

	var last_name = document.forms["studentDetailsform"]["last_Name"].value;

	var last_name_letters = /^([A-Za-z]+[ ]?|[a-z]+)+$/;
	if (last_name == "") {
		document.getElementById('last_Name_error_message').innerHTML = "Last Name must not be empty";
		document.getElementById('last_Name_error_message').style.color = "red";
		return false;
	}
	if (last_name.length < 2) {
		document.getElementById('last_Name_error_message').innerHTML = "Last Name must contain minimum two character";
		document.getElementById('last_Name_error_message').style.color = "red";
		return false;
	}
	if (!last_name.match(last_name_letters)) {
		document.getElementById('last_Name_error_message').innerHTML = "Last Name should not contain any numbers or special character";
		document.getElementById('last_Name_error_message').style.color = "red";
		return false;
	}
	// father name validation
	var father_name = document.forms["studentDetailsform"]["father_Name"].value;
	var father_name_letters = /^([A-Za-z]+[ ]?|[a-z]+)+$/;
	if (father_name == "") {
		document.getElementById('father_Name_error_message').innerHTML = "Father Name must be filled out";
		document.getElementById('father_Name_error_message').style.color = "red";
		return false;
	}
	if (father_name.length < 2) {
		document.getElementById('father_Name_error_message').innerHTML = "Father Name must contain minimum two character";
		document.getElementById('father_Name_error_message').style.color = "red";
		return false;
	}
	if (!father_name.match(father_name_letters)) {
		document.getElementById('father_Name_error_message').innerHTML = "father Name should not contain any numbers or special character";
		document.getElementById('father_Name_error_message').style.color = "red";
		return false;
	}

	// for email validation//
	var email = document.forms["studentDetailsform"]["email"].value;
	if (email.length == 0) {
		document.getElementById('email_error_message').innerHTML = "Email field is empty";
		document.getElementById('email_error_message').style.color = "red";
		return false;
	}
	// for class validation//
	var classval = document.forms["studentDetailsform"]["class_Name"].value;
	if (classval.length <= 0 || classval.length > 2) {
		if (classval.length == 0) {
			document.getElementById('class_Name_error_message').innerHTML = "Class field must not be empty";
		} else {
			document.getElementById('class_Name_error_message').innerHTML = "Class can only be less than two digits";
		}
		document.getElementById('class_Name_error_message').style.color = "red";
		return false;
	}
	// for age validation//
	var age = document.forms["studentDetailsform"]["age"].value;
	if (age.length <= 0 || age.length > 2) {
		if (age.length == 0) {
			document.getElementById('age_error_message').innerHTML = "Age field is empty";
		} else {
			document.getElementById('age_error_message').innerHTML = "Age should be less then 100";
		}
		document.getElementById('age_error_message').style.color = "red";
		return false;
	}
}
function numbers(e) {
	var x = (window.event) ? event.keyCode : e.which;
	if ((x >= 48 && x <= 57)) {
		return true;
	} else {
		return false;
	}
}