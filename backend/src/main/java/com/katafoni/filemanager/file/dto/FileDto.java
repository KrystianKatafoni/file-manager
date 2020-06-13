package com.katafoni.filemanager.file.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FileDto {
    private FileInfoDto fileInfoDto;
    private byte[] file;
}
