$('#contactForm').on('change', '[name=fullName]', function() {
	var fullName = $("[name=fullName]").val();
	var nameParams = fullName.split(" ");
	fullName = "";
	for (var i = 0; i < nameParams.length; i++) {
		if (nameParams[i] != "") {
			fullName += nameParams[i].substring(0, 1).toUpperCase() +
				nameParams[i].substring(1, nameParams[i].length) + " ";
		}
	}
	fullName = fullName.substring(0, fullName.length - 1);
	$("[name=fullName]").val(fullName);
});

$("#contactForm").submit(function(event) {
	//prevent default submit behavior
	event.preventDefault();
	//get values from FORM
	var fullName = $("[name=fullName]").val();
	var email = $("[name=email]").val();
	var phoneNumber = $("[name=phoneNumber]").val();
	var message = $("[name=message]").val();

	//check form values 
	if (!formValidation(fullName, email, phoneNumber, message)) {
		// Fail message
		createAlert("All fields is required except phone number.", "danger");
		return;
	} else {
		//check email format
		if (!isValidEmailAddress(email)) {
			// Fail message
			createAlert("Email Format is not valid.", "danger");
			return;
		}
	}
	addloading();
	$.ajax({
		url: "/Contact",
		type: "POST",
		data: {
			fullName: fullName,
			phoneNumber: phoneNumber,
			email: email,
			message: message
		},
		cache: false,
		success: function(data) {
			if (data == "success") {
				// Success message
				createAlert("Your message has been sent, Thank you.", "success");
			} else if (data == "error" || data != "success") {
				// Fail message
				createAlert("Sorry " + fullName + ", it seems that my mail server is not responding. Please try again later!", "danger");
			}
			//clear all fields
			$('#contactForm').trigger("reset");
		},
		error: function() {
			// Fail message
			createAlert("Sorry " + fullName + ", it seems that my mail server is not responding. Please try again later!", "danger");
			//clear all fields
			$('#contactForm').trigger("reset");
		},
	})
});

/*When clicking on Full hide fail/success boxes */
$('#name').focus(function() {
	$('#success').html('');
});

function formValidation(fullName, email, phoneNumber, message) {
	var res = false;
	res = isNotnull(fullName) &&
		isNotnull(email) &&
		//isNotnull(phoneNumber) &&
		isNotnull(message);
	return res;
}

function isNotnull(param) {
	if (param != null) {
		return !param.replace(" ", "") == "";
	} else {
		return false;
	}
}

function isValidEmailAddress(email) {
	var pattern = new RegExp(/^[+a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/i);
	return pattern.test(email);
}

function addloading() {
	$('#success').html("<div class='lds-spinner'><div></div><div></div><div></div><div></div><div></div><div></div><div></div><div></div><div></div><div></div><div></div><div></div></div>");
}

function createAlert(message, type) {
	$('#success').html("<div class='alert alert-" + type + "'>");
	$('#success > .alert-' + type).html("<button type='button' class='close' data-dismiss='alert' aria-hidden='true'>&times;")
		.append("</button>");
	$('#success > .alert-' + type).append("<strong>" + message);
	$('#success > .alert-' + type).append('</div>');
}