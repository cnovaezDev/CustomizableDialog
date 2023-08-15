# CustomizableDialog
Lightweight library that allows you to use a Customizable Dialog instead of the boring and predefined AlertDialogs

# Example Designs

![questionv2](https://github.com/cnovaezDev/CustomizableDialog/assets/103778694/b78767a5-0256-47bc-a84b-5581a581fa03)

![errorv2](https://github.com/cnovaezDev/CustomizableDialog/assets/103778694/f2e5b7df-f54a-402e-ad62-f829b3b0e7cc)

![warningv2](https://github.com/cnovaezDev/CustomizableDialog/assets/103778694/241eecda-a253-435a-83a9-cc82462364f3)

![infov2](https://github.com/cnovaezDev/CustomizableDialog/assets/103778694/e0781a19-a608-43a0-8ca6-37604af695e5)


# Add to the project

<strong>Step 1</strong>. Add it in your settings.gradle at the end of repositories:
<h6>maven { url 'https://jitpack.io' }</h6>

![image](https://github.com/cnovaezDev/CustomizableDialog/assets/103778694/1952db4d-a1f3-4a74-8c2e-1e7426e31b68)

<strong>Step 2</strong>. Add the dependency

<pre>
implementation 'com.github.cnovaezDev:CustomizableDialog:1.0.1'
</pre>

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

# Requirements
<ul>
 <li>kotlin version 1.6</li>
 <li>min sdk 23</li>
</ul>
