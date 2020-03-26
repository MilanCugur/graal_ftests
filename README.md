TESTING **Parse Important Features Graal Compiler Phase**: description of the features tests

For running our test please use mx tool (just invoke: "mx gate --tags features --features_dir PATH_TO_TESTS_DB")

* You can use our tool for adding "features test" examples, by simply running: **./src/makeftest FEATURES_TESTS_DB IGV_BIN_DIR** (Linux based)

  (Win and Mac users should run **python ./src/makeftest.py FEATURES_TESTS_DB IGV_BIN_DIR**, where python refere to python v2.7).

* Instead of this, you can write it down **manually**:

  Below are some basic rules that must be followed when adding tests into this library:
  
  Folder must contains: 
  * JAVA FILE: $.java 
  * GROUND TRUTH FILE: $.json
  ($ reference to java file name; notice that .java and .json file must have the same name)
  
  The ground truth file is jason based, it contains fields:
  * "source": (name of the test function)
  * "control splits": represent list of the Control Splits data, each contains fields:
  
      * "node" (node description in format nodeBCI|ControlSplitType; ex. "15|If")
      * "head" (Control Splits corresponding block; ex. "B1")
      * "sons" (Sons are represented as a list of comma separated strings which represent branch blocks; ex. ["B2, B3", "B4, B5", "x(loopExitNodeBCI|LoopExit)"])

  (suggested FOLDERNAME are "ftest[0-9]+"; suggested function name are "example_FOLDERNAME", but these recommendations not need to be followed)

