package com.kdg.recipe.converters;

import com.kdg.recipe.commands.NoteCommand;
import com.kdg.recipe.domains.Note;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class NoteToNoteCommand implements Converter<Note, NoteCommand> {

    @Synchronized
    @Nullable
    @Override
    public NoteCommand convert(Note note) {
        if (note == null) {
            return null;
        }

        final NoteCommand noteCommand = new NoteCommand();
        noteCommand.setId(note.getId());
        noteCommand.setRecipeNotes(note.getRecipeNotes());

        return noteCommand;
    }
}
