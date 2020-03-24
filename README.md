TESTING **Parse Important Features Graal Compiler Phase**: description of the features tests

For running our test please use mx tool (just invoke: "mx gate --tags features --features_dir PATH_TO_DIRECTORY_WITH_TEST_FILES")

* You can use our tool for adding "features test" examples, by simply running: **./src/makeftest FEATURES_TESTS_DIR IGV_BIN_DIR** (Linux based).

* Instead of this, you can write it down **manually**:

  Below are some basic rules that must be followed when adding tests into this library:
  
  FOLDER NAME: custom (referenced bellow as $) (suggested "ftest[0-9]+")
  Folder contains: 
  * JAVA FILE: $.java
  * FUNCTION NAME (in .java file) FOR TEST: example_$
  * GROUND TRUTH FILE: $.json

  The ground truth file is jason based, it contains fields:
  * "source" (name of the test function, example_$)
  * "control splits"
    Field "control splits" represent list of the Control Splits data, each contains fields:
  
      * "node" (node description in format nodeBCI|ControlSplitType; ex. "15|If")
      * "head" (Control Splits corresponding block; ex. "B1")
      * "sons" (Sons are represented as a list of comma separated strings which represent branch blocks; ex. ["B2, B3", "B4, B5"])


