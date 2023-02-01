# Compose quadrant
In this exercise, you need to apply most of the concepts that you learned so far and then go a step further to explore a new Modifier and properties. 
This might look like an extra challenge, but don't worry! You can check the References section for this problem, where you can find the links to these 
Modifier classes and properties, and use them for implementation.developments.
You need to build an app that displays the information about the Composable functions that you learned.

The screen is divided into four quadrants. Each quadrant provides the name of a Composable function and describes it in one sentence.

### Final Screenshot
After you finish the implementation, your design should match this screenshot:

<img src="./app/src/main/res/drawable-nodpi/screenshot.png" style="width:300px;"/>

**UI specifications**

Follow these UI specifications for the entire screen:

* Divide the entire screen into four equal parts, each of which contains a Compose card and displays information about a Composable function

<img src="./app/src/main/res/drawable-nodpi/screenshot2.png" style="width:400px;"/>

1. Set the entire quadrant (start, end, top, and bottom) to a 16dp padding.
2. Center align all of the content vertically and horizontally in each quadrant.
3. Format the first Text composable in bold and set it to a 16dp padding bottom.
4. Set the second Text composable to a Default font size.

**Resources**

These colors:

* androidx.compose.ui.graphics.Color.Green
* androidx.compose.ui.graphics.Color.Yellow
* androidx.compose.ui.graphics.Color.Cyan
* androidx.compose.ui.graphics.Color.LightGray

These strings:

* Text composable
* Displays text and follows Material Design guidelines.
* Image composable
* Creates a composable that lays out and draws a given Painter class object.
* Row composable
* A layout composable that places its children in a horizontal sequence.
* Column composable
* A layout composable that places its children in a vertical sequence.
