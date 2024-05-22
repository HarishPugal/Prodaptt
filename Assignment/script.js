// Get form elements
const form = document.getElementById('customerForm');
const nameInput = document.getElementById('name');
const emailInput = document.getElementById('email');
const contactInput = document.getElementById('contact');
const accountTypeSelect = document.getElementById('accountType');
const customerList = document.getElementById('customerList');

// Add event listener for form submission
form.addEventListener('submit', function(e) {
  e.preventDefault(); // Prevent form from submitting

  // Perform validation
  let isValid = true;

  // Name validation
  const nameRegex = /^[a-zA-Z\s]+$/;
  if (!nameRegex.test(nameInput.value.trim())) {
    isValid = false;
    document.getElementById('nameError').textContent = 'Please enter only alphabets';
  } else {
    document.getElementById('nameError').textContent = '';
  }

  // Email validation
  const emailRegex = /^\S+@\S+\.\S+$/;
  if (!emailRegex.test(emailInput.value.trim())) {
    isValid = false;
    document.getElementById('emailError').textContent = 'Please enter a valid email address';
  } else {
    document.getElementById('emailError').textContent = '';
  }

  // Contact number validation
  const contactRegex = /^[7-9]\d{9}$/;
  if (!contactRegex.test(contactInput.value.trim())) {
    isValid = false;
    document.getElementById('contactError').textContent = 'Please enter a valid 10-digit contact number starting with 7, 8, or 9';
  } else {
    document.getElementById('contactError').textContent = '';
  }

  // Account type validation
  if (accountTypeSelect.value === '') {
    isValid = false;
    document.getElementById('accountTypeError').textContent = 'Please select an account type';
  } else {
    document.getElementById('accountTypeError').textContent = '';
  }

  // If all fields are valid, create customer object and display in table
  if (isValid) {
    const customer = {
      name: nameInput.value.trim(),
      email: emailInput.value.trim(),
      contact: contactInput.value.trim(),
      accountType: accountTypeSelect.value
    };

    // Create a new table row
    const row = document.createElement('tr');

    // Add table data cells
    const nameCell = document.createElement('td');
    nameCell.textContent = customer.name;
    row.appendChild(nameCell);

    const emailCell = document.createElement('td');
    emailCell.textContent = customer.email;
    row.appendChild(emailCell);

    const contactCell = document.createElement('td');
    contactCell.textContent = customer.contact;
    row.appendChild(contactCell);

    const accountTypeCell = document.createElement('td');
    accountTypeCell.textContent = customer.accountType;
    row.appendChild(accountTypeCell);

    // Append the row to the table body
    customerList.appendChild(row);

    // Clear the form inputs
    form.reset();
  }
});