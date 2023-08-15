# CustomizableDialog
Lightweight library that allows you to use a Customizable Dialog instead of the boring and predefined AlertDialogs

# Example Designs

![info](https://github.com/cnovaezDev/CustomizableDialog/assets/103778694/11df95d7-d70a-46d2-aee4-1ed2749fbefe)

![error](https://github.com/cnovaezDev/CustomizableDialog/assets/103778694/2e064531-13b6-4696-8bdd-c5ea67db7ced)

![warning](https://github.com/cnovaezDev/CustomizableDialog/assets/103778694/bb4b52e3-913a-4ed7-992d-923fffa72a82)

![question](https://github.com/cnovaezDev/CustomizableDialog/assets/103778694/0725f4de-60af-485c-80a0-7248daf82594)



# Add to the project

Step 1. Add it in your settings.gradle at the end of repositories:
<h6>maven { url 'https://jitpack.io' }</h6>

![image](https://github.com/cnovaezDev/CustomizableDialog/assets/103778694/1952db4d-a1f3-4a74-8c2e-1e7426e31b68)

Step 2. Add the dependency
implementation 'com.github.cnovaezDev:CustomizableDialog:1.0.1'

# Example of use

<pre>
 
 showGenericDialog(CustomizableDialogItem(
                    title = "App finished loading", //Title of the dialog
                    content = "All the data is ready to be used!", //Content of the dialog
                    cancelBtnLabel = "Nop", // Label of the cancel button
                    acceptBtnLabel = "Understood", //Label of the accept button
                    selectedMode = GenericModeType.info_type, //Predefined mode to use with design defined by default, optional and customizable.
                    twoButtons = true //Quantity of buttons to display, depending of the type of message that you want to display, is true by default.
                ),
                object : OnInteractionSelectedListener {
                    override fun onAccept(result: Any?) {
                        Toast.makeText(this@MainActivity, "Accept Button", Toast.LENGTH_LONG).show()
                        //Action to perform in case of the user pressing accept button
                    }

                    override fun onCancel(result: Any?) {
                        Toast.makeText(this@MainActivity, "Cancel Button", Toast.LENGTH_LONG).show()
                        //Action to perform in case of the user pressing the cancel button

                    }
                })
</pre>

# All the properties

<pre>
CustomizableDialogItem(
                    title = "App finished loading", //Title of the dialog
                    content = "All the data is ready to be used!", //Content of the dialog
                    cancelBtnLabel = "Nop", // Label of the cancel button
                    acceptBtnLabel = "Understood", //Label of the accept button
                    selectedMode = GenericModeType.info_type, //Predefined mode to use with design defined by default, optional and customizable.
                    twoButtons = true, //Quantity of buttons to display, depending of the type of message that you want to display, is true by default.
                     acceptBtnCustomColor = R.color.blue, // Accept button color
                    cancelBtnCustomColor = R.color.red, // Cancel button color
                    titleTextColor = R.color.white, //Title text color
                    contentTextColor = R.color.black, //Content text color
                    customCardHeaderBackgroundColor = R.color.green, //Card header background color
                    image = GenericImageType.question_pic, // Predefine pics to choose from
                    customImage = R.drawable.info_pic, // A custom pic to be used, if especified the previous image property is ignored.
                )
</pre>
