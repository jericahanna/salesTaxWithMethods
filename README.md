# SalesTaxWithMethods project

This project will be to take the logic you did in
the previous project and split that logic into individual
methods. 

## Step 1: Fork the project

To create a copy of my base code into your own repo, you
will need to fork this project.

In the top bar here in GitHub there is a fork button. Press that,
and make sure you are logged into your GitHub account. It will
prompt you with some default settings for this new copied repo,
and you can accept and fork the project.

You now have your own repo with a copy of my starter code for this project.

## Step 2: Clone the repo

Now you will clone your repo to your local computer. 

Click the green code button on your GitHub repo. Make sure HTTPS tab is selected
and copy the https URL.

Use your terminal/git bash on your computer and navigate to
wherever you save your Java projects. Once you are where you want
to copy the project, type:

git clone https://copiedurl

Where the copied URL is the one you copied from the green code button
on GitHub.

Hit enter and the project will clone to your computer.

## Step 3: Open the project in IntelliJ

Open IntelliJ and select open. Navigate to the salesTaxWithMethod folder
and select open. You now have the project open in IntelliJ and ready to make changes!

## Step 4: Push changes to GitHub

Once you have made your changes and tested that they work, you will need to 
push your changes to GitHub. 

In IntelliJ there's a terminal already open you can use, or you can do this in
your own terminal as long as you navigated to the project directory.

In the terminal type the following commands:
git add .
git commit -m "summary of your changes"
git push

At any point you can type: git status
This will give you the status of your changes, whether you added
or committed them already.

You will repeat this process anytime you want to push new changes.

## Step 5: Check automated tests

Once your changes are pushed you can check to see if the automated tests have passed.

In GitHub with your repository open, select Actions on the top bar.
You will see an action run. It needs to be green. If it is red, click into it
and check which job failed. You can click on the test results and see which tests
failed. If you have any failing tests, you will need to go back to your code
and make changes so the tests will pass.

Do not edit the tests. I will notice ;)

## Step 6: Turn it in

Once you have passing tests, copy your repo URL and turn it into
the dropbox on MyHills.
