/* === Remove spaces and auto-suffix duplicates === */
app.beginPriv();

function uniq(name, seen) {                   // helper to add _1, _2 …
    var base = name, n = 1;
    while (seen[base]) base = name + "_" + n++;
    return base;
}

var already = {};                             // map of names we’ve taken

for (var i = this.numFields - 1; i >= 0; i--) {      // work backwards
    var oldName = this.getNthFieldName(i);
    var tmp     = oldName.replace(/\s+/g, "");       // ► "" = delete
    // use  "_"  instead of "" if you prefer underscores

    var newName = uniq(tmp, already);         // ensure uniqueness
    already[newName] = 1;                     // mark as used

    if (oldName !== newName)
        this.renameField(oldName, newName);
}

app.endPriv();
