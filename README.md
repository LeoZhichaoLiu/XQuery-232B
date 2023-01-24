# XQuery-232B

XPath: 

- Use Antlr 4 to parse the query string into semantic tree, with nodes handling different functions. 
- Use Java.xml.document api to translate xml into document tree object. 
- Based on the semantic tree of query, start searching the answer in terms of node object from xml document tree. The searching will start from the root of xml tree, and perform different operations according to the query semantic tree. 
