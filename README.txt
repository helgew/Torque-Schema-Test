To illustrate, I 
have created& <a 
href="https://github.com/helgew/Torque-Schema-Test">a github 
project</a>. As you will see, there are two schema files:& <a 
href="https://github.com/helgew/Torque-Schema-Test/blob/master/src/main/
torque/schema/first-schema.xml">first-schema.xml</a>& and& <a 
href="https://github.com/helgew/Torque-Schema-Test/blob/master/src/main/
torque/schema/second-schema.xml">second-schema.xml</a>& which 
includes the first. The& <a 
href="https://github.com/helgew/Torque-Schema-Test/tree/master/target/ge
nerated-sources/torque/org/grajagan">generated base classes</a>& for 
tbl1 and tbl3 differ in that& <a 
href="https://github.com/helgew/Torque-Schema-Test/blob/master/target/ge
nerated-sources/torque/org/grajagan/BaseTbl3.java">BaseTbl3</a>& has 
the getter methods for the link table tbl_link_int (e.g.& <a 
href="https://github.com/helgew/Torque-Schema-Test/blob/master/target/ge
nerated-sources/torque/org/grajagan/BaseTbl3.java#L168">getTblLinkInts()</
a>), whereas& <a 
href="https://github.com/helgew/Torque-Schema-Test/blob/master/target/ge
nerated-sources/torque/org/grajagan/BaseTbl1.java">BaseTbl1</a>& does 
not.</div><div><br></div><div>I think it would be a very useful feature 
to be able to split a large schema into several sub-schema files and not 
lose the ability to generate these setters!
