# XML-Editor

## ***IDEA***
* XML (Extensible Markup Language) is one of the most famous formats for storing and sharing information among different devices. 
Some text editors such as Sublime Text are able to parse such files and do some basic operations. In this project, you will work on developing a GUI (Graphical User Interface) based program to parse and visualize an XML file. 
* In our system the XML file will represent users in a social network
* Each user has id (unique), name, list of posts, list of followers.
* Each post has text and list of topics

## ***Project Phase#1***  

### Supported Features:
- Graphical User Interface (GUI)
- Consistency check
- Error Detection and Correction (if any occur)
- Format/Prettify
- Minify
- XML to JSON
- Compression/decompression

#### `Graphical User Interface (GUI)`
- A GUI in which the user can specify the location of an input XML file and the output files.
- A simple GUI window contains a set of buttons that are used to choose the operation that needs to be done on the XML file.
- Allow the user to choose the XML file that will be used or enter the xml manually in a text area.
- Allow viewing the input XML and the output of each operation as much as possible (In case large files you can view only the first lines of the file).
- Allow the user to save the results of the operations to a new file

#### `Consistency check`
- The input XML may have inconsistencies like missing any of the closing and opening tags or not matching tags.
- Check if the XML file is consistent, that is, all opening tags have corresponding closing tags.
- This check is done using Stack data structure.
- If the XML file is inconsistent, number of errors, and tags left in the stack are displayed to the user.

#### `Format/Prettify`
- XML file should be well formatted by keeping the indentation for each level.
- Adjust the indentation of an XML file, to make it more readable.
- If the file is not consistent, user cannot format it.

#### `Minify`
- Since spaces and newlines (\n) are actually characters that can increase the size of an XML document. 
- This feature should aim at decreasing the size of an XML file (compressing it) by deleting the whitespaces and indentations

#### `XML to JSON`
JSON((Javascript Object Notation) is a format that is used to represent data, and It’s helpful to convert the XML into JSON, especially when using 
javascript as there’s tons of libraries and tools that use json notation.
Conversion to XML is done on three iterations:
1. Transform the xml string into array of node objects.
2. Transform this array into a tree of nodes.
3. Transform the tree recursively into JSON string.

#### `Compression/Decompression`
- Compression using Huffman-Coding.
- This type of compression is done using heap (min priority queue) and tree data structure.
- By using variable character sizes we can compress the input file efficiently.
- The smaller the output file is, the more efficient your algorithm is
- Decompressing the compressed data to return to its original format

## ***Project Phase#2***  
