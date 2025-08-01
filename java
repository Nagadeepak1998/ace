app.beginPriv();
for (var i = 0; i < this.numFields; i++) {
    var oldName = this.getNthFieldName(i);        // Get the current field name
    var newName = oldName.replace(/\s+/g, "");    // Remove all spaces
    if (oldName !== newName) this.getField(oldName).rename(newName);
}
app.endPriv();
