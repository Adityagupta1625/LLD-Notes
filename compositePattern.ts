// Composite is a structural design pattern that lets you compose objects into tree structures and then work with these structures as if they were individual objects.

// Problem: let us consider a file system where we have a directory and a file. we want to get the size of a file or directory. so we need to traverse the file system to get the size of a file or directory. so we need to add conditions based on object types then process it. so we need to add more if else statements in our code. code will become difficult to manage

// Solution: we can implement file and directory through common interface and then call for ls method irrespective of the concrete class and we can compose objects the tree structure. we can simply either process request or pass it to down tree.

// Structure:

// component: This is the interface that are common to both simple and complex elements of the tree.

// leaf: This class do not have any sub elements. they do most of real work.

// composite: This class has sub elements. it can add and remove them. it delegates the request to its sub elements.

// client: This is the client that uses the composite pattern. It creates a composite object and uses it to traverse the tree.

// refer to the calculator and file system lld examples
