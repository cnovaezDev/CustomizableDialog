# CustomizableDialog
Lightweight library that allows you to use a Customizable Dialog instead of the boring and predefined AlertDialogs

# Add to the project

Step 1. Add it in your settings.gradle at the end of repositories:
<h6>maven { url 'https://jitpack.io' }</h6>

![image](https://github.com/cnovaezDev/CustomizableDialog/assets/103778694/1952db4d-a1f3-4a74-8c2e-1e7426e31b68)

Step 2. Add the dependency
implementation 'com.github.cnovaezDev:CustomizableDialog:1.0.1'

#Example of use

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

#All the properties
CustomizableDialogItem(
                    title = "App finished loading", //Title of the dialog
                    content = "All the data is ready to be used!", //Content of the dialog
                    cancelBtnLabel = "Nop", // Label of the cancel button
                    acceptBtnLabel = "Understood", //Label of the accept button
                    selectedMode = GenericModeType.info_type, //Predefined mode to use with design defined by default, optional and customizable.
                    twoButtons = true //Quantity of buttons to display, depending of the type of message that you want to display, is true by default.
                     acceptBtnCustomColor = R.color.white,
                    cancelBtnCustomColor = R.color.white,
                    titleTextColor = R.color.white,
                    contentTextColor = R.color.black,
                    customCardHeaderBackgroundColor = R.color.green,
                    image = GenericImageType.question_pic,
                    customImage = R.drawable.info_pic,
                )
